import javax.swing.*;

public class Calculator extends JFrame {

    MainPanel mainPanel;
    Function function;
    Number number;

    Calculator() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setSize(400, 400);
        this.setResizable(false);

        mainPanel();

        this.setVisible(true);
    }

    public void mainPanel() {
        mainPanel = new MainPanel();
        mainPanel.setMainPanel();

        function = new Function(mainPanel);
        number = new Number(mainPanel);

        this.add(mainPanel.getMainPanel());
    }


}
