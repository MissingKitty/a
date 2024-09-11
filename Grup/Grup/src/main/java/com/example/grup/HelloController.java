package com.example.grup;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.Map;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    private Label Lb1, Lb2;
    @FXML
    private TextField Fil1, Fil2, Fil3;
    @FXML
    private Button Bt1, Ext;

    @FXML
    void Bt1() {
        float n, n1, n2, n3;
        int a;
        if (Pattern.matches("[а-яА-Я, a-zA-Z]+", Fil1.getText())) {
            JOptionPane.showMessageDialog(null, "Группа 1 содержет текст");
        }
        if (Pattern.matches("[а-яА-Я, a-zA-Z]+", Fil2.getText())) {
            JOptionPane.showMessageDialog(null, "Группа 2 содержет текст");
        }
        if (Pattern.matches("[а-яА-Я, a-zA-Z]+", Fil3.getText())) {
            JOptionPane.showMessageDialog(null, "Группа 3 содержет текст");
        }
        if (Pattern.matches("[0-9, .]+", Fil1.getText()) || Fil1.getText().contains(".")) {
            if (Pattern.matches("[0-9, .]+", Fil2.getText()) || Fil2.getText().contains(".")) {
                if (Pattern.matches("[0-9, .]+", Fil3.getText()) || Fil3.getText().contains(".")) {

                    n1 = Float.parseFloat(Fil1.getText());
                    n2 = Float.parseFloat(Fil2.getText());
                    n3 = Float.parseFloat(Fil3.getText());

                    n1 = n1 / 2;
                    n2 = n2 / 2;
                    n3 = n3 / 2;

                    n = Math.round(n1) + Math.round(n2) + Math.round(n3);

                    Lb1.setText("Нужно столов в общем:  " + Math.round(n));
                    Lb2.setText("Нужно столов в группах 1-3: " + Math.round(n1) + ", " + Math.round(n2) + ", " + Math.round(n3));
                }
            }
        }
    }

    @FXML
    void Ext() {
        System.exit(0);
    }
}