package com.meghpathak;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor extends JFrame {

    public static void main(String[] args) {

        new TextEditor();

    }

    private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
    private String currentFile= "Untitled";
    private JTextArea editArea;
    private JMenuItem New;
    private JMenuItem Open;
    private JMenuItem Save;
    private JMenuItem SaveAs;
    private JMenuItem Exit;
    private JMenuItem Cut;
    private JMenuItem Copy;
    private JMenuItem Paste;
    private boolean changed = false; //boolean flag to check if text was edited

    public TextEditor() {
        editArea = new JTextArea(20, 120);
        JScrollPane scroller = new JScrollPane(editArea);
        setContentPane(scroller);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setSize(600,500);
        setTitle("Text Editor");

        JMenu fileMenu = new JMenu("File");

        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Save = new JMenuItem("SaveAs");
        Exit = new JMenuItem("Exit");

        Action Open = new AbstractAction("Open"){
            public void actionPerformed(ActionEvent e){
                saveOld();
                if( dialog.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                    readInFile(dialog.getSelectedFile().getAbsolutePath());
                }
            }
        };

        Action Save = new AbstractAction("Save"){
            public void actionPerformed(ActionEvent e){
                if(!currentFile.equals("Untitled")){
                    saveFile(currentFile);
                } else {
                    saveFileAs();
                }
            }
        };

        Action SaveAs = new AbstractAction("Save as"){
            public void actionPerformed(ActionEvent e){
                saveFileAs();
            }
        };

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(Open);
        fileMenu.add(Save);
        fileMenu.add(SaveAs);
        fileMenu.add(Exit);

        JMenu editMenu = new JMenu("Edit");

        Cut = new JMenuItem("Cut");
        Action cutAction = new DefaultEditorKit.CutAction();
        cutAction.putValue(Action.NAME, "Cut");

        Copy = new JMenuItem("Copy");
        Action copyAction = new DefaultEditorKit.CopyAction();
        copyAction.putValue(Action.NAME, "Copy");

        Paste = new JMenuItem("Paste");
        Action pasteAction = new DefaultEditorKit.PasteAction();

        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);
        pasteAction.putValue(Action.NAME, "Paste");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //actual logic for save/open/etc functions
    private void saveFileAs(){
        if(dialog.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            saveFile(dialog.getSelectedFile().getAbsolutePath());
        }
    }

    private void saveOld(){
        if(changed){
            if(JOptionPane.showConfirmDialog(this, "Would you like to save " + currentFile + " ?","Save", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                saveFile(currentFile);
            }
        }
    }

    private void readInFile(String fileName){
        try{
            FileReader fr = new FileReader(fileName);
            editArea.read(fr, null);
            fr.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed = false;
        } catch(IOException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void saveFile(String fileName){
        try{
            FileWriter fw = new FileWriter(fileName);
            editArea.write(fw);
            fw.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed = false;
            Save.setEnabled(false);
        } catch( IOException e ){
            JOptionPane.showMessageDialog(this, "Cannot Edit File " + fileName);
        }
    }
}
