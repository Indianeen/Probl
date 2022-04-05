package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String svar = JOptionPane.showInputDialog("Type the word you want to reverse.");



        String rev = reverse(svar);
        JOptionPane.showInputDialog(null, "Your word (" + svar + ") becomes: " + rev + ", when reversed.");
    }
}
