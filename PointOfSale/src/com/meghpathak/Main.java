package com.meghpathak;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("P.O.S");
        JPanel panel = new JPanel();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel productNameLabel = new JLabel("Product Name");
        productNameLabel.setBounds(10, 20, 100, 25);
        panel.add(productNameLabel);

        JTextField productNameTextField = new JTextField(20);
        productNameTextField.setBounds(120,20,250,25);
        panel.add(productNameTextField);

        JLabel productTypeLabel = new JLabel("Product Type");
        productTypeLabel.setBounds(10, 50, 100, 25);
        panel.add(productTypeLabel);

        JTextField productTypeTextField = new JTextField(20);
        productTypeTextField.setBounds(120,50,250,25);
        panel.add(productTypeTextField);

        JLabel unitPriceLabel = new JLabel("Unit Price");
        unitPriceLabel.setBounds(10, 80, 100, 25);
        panel.add(unitPriceLabel);

        JTextField unitPriceTextField = new JTextField(20);
        unitPriceTextField.setBounds(120,80,125,25);
        panel.add( unitPriceTextField);

        JLabel quantityLabel = new JLabel("Quantity");
        quantityLabel.setBounds(10, 110, 100, 25);
        panel.add(quantityLabel);

        JTextField quantityTextField = new JTextField(20);
        quantityTextField.setBounds(120,110,63,25);
        panel.add(quantityTextField);

        JLabel totalCostLabel = new JLabel("Total Cost");
        totalCostLabel.setBounds(10, 140, 100, 25);
        panel.add(totalCostLabel);

        JTextField totalCostTextField = new JTextField(20);
        totalCostTextField.setBounds(120,140,125,25);
        panel.add(totalCostTextField);

        JButton sumButton = new JButton("Sum");
        sumButton.setBounds(40, 170, 80, 25);
        panel.add(sumButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(121, 170, 80, 25);
        panel.add(clearButton);


    }
}
