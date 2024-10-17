package com.usbcali.figuras;

import javax.swing.JOptionPane;

public class PopUp {

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static String showInputMessage(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public static int showOptions(String message, String[] options) {
        String selectedOption = (String) JOptionPane.showInputDialog(null, message, "Select an option",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        // Get the index of the selected option
        if (selectedOption != null) {
            for (int i = 0; i < options.length; i++) {
                if (options[i].equals(selectedOption)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
