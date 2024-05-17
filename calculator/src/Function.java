import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Function implements ActionListener {

    private double number1;
    private double number2;
    private double resault;
    protected String operation;
    private final MainPanel mainPanel;

    public Function(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        for (JButton button : this.mainPanel.getFunctionButtons()) {
            button.addActionListener(this);
        }
    }

    public double getNumber1() {
        return number1;
    }
    public double getNumber2() {
        return number2;
    }
    public double getResault() {
        return resault;
    }
    public void setNumber1(Double number1) {
        this.number1 = number1;
    }
    public void setNumber2(Double number2) {
        this.number2 = number2;
    }
    public void setResault(Double resault) {
        this.resault = resault;
    }

    public double resaultFunction(){
        setNumber2(Double.parseDouble(MainPanel.numberTextArea.getText()));

        switch (operation){
            case "+":
                setResault(getNumber1() + getNumber2());
                break;
            case "-":
                setResault(getNumber1() - getNumber2());
                break;
            case "*":
                setResault(getNumber1() * getNumber2());
                break;
            case "/":
                setResault(getNumber1() / getNumber2());
                break;
            case "^":
                setResault(Math.pow(getNumber1() ,getNumber2()));
                break;

        }
        return getResault();

    }

    //making function buttons ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == mainPanel.functionButton[0]) {
                if (operation == null) {
                    setNumber1(Double.parseDouble(MainPanel.numberTextArea.getText()));
                } else {
                    setNumber1(resaultFunction());

                }
                operation = "+";
                MainPanel.numberTextArea.setText("");

            }
            else if (e.getSource() == mainPanel.functionButton[1]) {
                if (operation == null) {
                    setNumber1(Double.parseDouble(MainPanel.numberTextArea.getText()));
                } else {
                    setNumber1(resaultFunction());
                }
                operation = "-";
                MainPanel.numberTextArea.setText("");

            }
            else if (e.getSource() == mainPanel.functionButton[2]) {
                if (operation == null) {
                    setNumber1(Double.parseDouble(MainPanel.numberTextArea.getText()));
                } else {
                    setNumber1(resaultFunction());
                }
                operation = "*";
                MainPanel.numberTextArea.setText("");

            }
            else if (e.getSource() == mainPanel.functionButton[3]) {
                if (MainPanel.numberTextArea.getText().charAt(0) != '.') MainPanel.numberTextArea.append(".");
            }
            else if (e.getSource() == mainPanel.functionButton[4]){
                if (operation == null) {
                    setNumber1(Double.parseDouble(MainPanel.numberTextArea.getText()));
                } else {
                    setNumber1(resaultFunction());
                }
                operation = "/";
                MainPanel.numberTextArea.setText("");
            }
            else if (e.getSource() == mainPanel.functionButton[5]) {
                MainPanel.numberTextArea.setText(String.valueOf(resaultFunction()));
                setNumber1(getResault());
                operation = null;
            }
            else if (e.getSource() == mainPanel.functionButton[8]) {
                double temp = Double.parseDouble(MainPanel.numberTextArea.getText());
                temp *= -1;
                MainPanel.numberTextArea.setText(String.valueOf(temp));
            }
            else if (e.getSource() == mainPanel.functionButton[6]) {
                setNumber1(0.0);
                setNumber2(0.0);
                setResault(0.0);
                operation = null;
                MainPanel.numberTextArea.setText("");
            }
            else if (e.getSource() == mainPanel.functionButton[7]) {
                String temp = MainPanel.numberTextArea.getText();

                String newText = temp.substring(0, temp.length() - 1);
                MainPanel.numberTextArea.setText(newText);

            }
            else if (e.getSource() == mainPanel.functionButton[9]){
                if (operation == null) {
                    setNumber1(Double.parseDouble(MainPanel.numberTextArea.getText()));
                } else {
                    setNumber1(resaultFunction());
                }
                operation = "^";
                MainPanel.numberTextArea.setText("");
            }
        }
        catch (StringIndexOutOfBoundsException | NumberFormatException ignored){}
    }
}
