import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;

public class MainPanel {

    public static JTextArea numberTextArea;

    protected JButton[] numberButton = new JButton[10];
    protected JButton[] functionButton = new JButton[10];
    protected String[] functionTags ={"1","2","3","+","4","5","6", "-","7","8","9", "*","0" , ".",  "/" ,"=" , "clr", "del" , "-", "^" };
    private JPanel buttonsPanel;
    public static JPanel mainPanel;

    public void setMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        numberTextArea = new JTextArea();
        numberTextArea.setEditable(false);
        numberTextArea.setPreferredSize(new Dimension(100, 80));

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(5, 4)); // Adjusted to fit all buttons

        for (int i = 0,j = 0, k=0; i < 20; i++) {
            if (i == 3 || i == 7 || i == 11 || i >= 13) {
                functionButton[j] = new JButton(functionTags[i]);
                buttonsPanel.add(functionButton[j]);
                functionButton[j].setBackground(new Color(70, 130, 180));
                functionButton[j].setForeground(Color.WHITE);
                functionButton[j].setFocusPainted(false);
                functionButton[j].setFont(new Font("Arial", Font.BOLD, 20));
                j++;
            } else {
                numberButton[k] = new JButton(functionTags[i]);
                buttonsPanel.add(numberButton[k]);
                numberButton[k].setBackground(new Color(70, 130, 180));
                numberButton[k].setForeground(Color.WHITE);
                numberButton[k].setFocusPainted(false);
                numberButton[k].setFont(new Font("Arial", Font.BOLD, 20));
                k++;
            }

        }



        mainPanel.add(numberTextArea, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton[] getNumberButtons() {
        return numberButton;
    }

    public JButton[] getFunctionButtons() {
        return functionButton;
    }
}
