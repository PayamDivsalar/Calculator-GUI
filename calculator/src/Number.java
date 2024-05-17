import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Number implements ActionListener {

    private final MainPanel mainPanel;

    public Number(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        for (JButton button : this.mainPanel.getNumberButtons()) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == mainPanel.numberButton[i]) {
                MainPanel.numberTextArea.append(String.valueOf(i+1));

            }
        }
        if(e.getSource() == mainPanel.numberButton[9]) MainPanel.numberTextArea.append("0");
    }
}

