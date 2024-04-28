

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame {

    //method for checking an string is float or integer
    public static boolean IsInteger (String x){

        for(int i =0; i <x.length();i++){
            if(x.charAt(i)=='.') return false;
        }
        return true;

    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("calc");
        Dimension framesize = new Dimension(1024,720);
        frame.setSize(framesize);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.PINK);


        panel.setBounds(300,100,424,520);
        frame.add(panel);
        Font ButtonFont = new Font(Font.SANS_SERIF, Font.BOLD, 24);


        JTextArea NumberTextArea = new JTextArea();
        panel.add(NumberTextArea,BorderLayout.NORTH);
        NumberTextArea.setPreferredSize(new Dimension(100,80));
        NumberTextArea.setFont(ButtonFont.deriveFont(Font.PLAIN));

        JPanel ButtonPanel = new JPanel(new GridLayout(5,4));


        JButton SevenButton = new JButton("7");
        SevenButton.setFont(ButtonFont);
        ButtonPanel.add(SevenButton);

        JButton EightButton = new JButton("8");
        EightButton.setFont(ButtonFont);
        ButtonPanel.add(EightButton);

        JButton NineButton = new JButton("9");
        NineButton.setFont(ButtonFont);
        ButtonPanel.add(NineButton);

        JButton PlusButton = new JButton("+");
        PlusButton.setFont(ButtonFont);
        ButtonPanel.add(PlusButton);



        JButton FourButton = new JButton("4");
        FourButton.setFont(ButtonFont);
        ButtonPanel.add(FourButton);

        JButton FiveButton = new JButton("5");
        FiveButton.setFont(ButtonFont);
        ButtonPanel.add(FiveButton);

        JButton SixButton = new JButton("6");
        SixButton.setFont(ButtonFont);
        ButtonPanel.add(SixButton);

        JButton MinusButton = new JButton("-");
        MinusButton.setFont(ButtonFont);
        ButtonPanel.add(MinusButton);

        JButton OneButton = new JButton("1");
        OneButton.setFont(ButtonFont);
        ButtonPanel.add(OneButton);

        JButton TwoButton = new JButton("2");
        TwoButton.setFont(ButtonFont);
        ButtonPanel.add(TwoButton);

        JButton ThreeButton = new JButton("3");
        ThreeButton.setFont(ButtonFont);
        ButtonPanel.add(ThreeButton);

        JButton CrossButton = new JButton("*");
        CrossButton.setFont(ButtonFont);
        ButtonPanel.add(CrossButton);


        JButton ZeroButton = new JButton("0");
        ZeroButton.setFont(ButtonFont);
        ButtonPanel.add(ZeroButton);

        JButton DatButton = new JButton(".");
        DatButton.setFont(ButtonFont);
        ButtonPanel.add(DatButton);

        JButton DivisionButton = new JButton("/");
        DivisionButton.setFont(ButtonFont);
        ButtonPanel.add(DivisionButton);

        JButton EqualButton = new JButton("=");
        EqualButton.setFont(ButtonFont);
        ButtonPanel.add(EqualButton);

        JButton ClearButton = new JButton("Clr");
        MinusButton.setFont(ButtonFont);
        ButtonPanel.add(ClearButton);

        JButton DelButton = new JButton("Del");
        MinusButton.setFont(ButtonFont);
        ButtonPanel.add(DelButton);

        JButton NegativeButton = new JButton("-");
        MinusButton.setFont(ButtonFont);
        ButtonPanel.add(NegativeButton);

        JButton PowerButton = new JButton("Pow");
        MinusButton.setFont(ButtonFont);
        ButtonPanel.add(PowerButton);




        panel.add(ButtonPanel,BorderLayout.SOUTH);


        OneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("1");
                frame.revalidate();
                frame.repaint();
            }
        });


        TwoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("2");
                frame.revalidate();
                frame.repaint();
            }
        });


        ThreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("3");
                frame.revalidate();
                frame.repaint();
            }
        });


        FourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("4");
                frame.revalidate();
                frame.repaint();
            }
        });


        FiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("5");
                frame.revalidate();
                frame.repaint();
            }
        });


        SixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("6");
                frame.revalidate();
                frame.repaint();
            }
        });


        SevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("7");
                frame.revalidate();
                frame.repaint();
            }
        });


        EightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("8");
                frame.revalidate();
                frame.repaint();
            }
        });


        NineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("9");
                frame.revalidate();
                frame.repaint();
            }
        });


        ZeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("0");
                frame.revalidate();
                frame.repaint();
            }
        });



        DatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append(".");
                frame.revalidate();
                frame.repaint();
            }
        });

        NegativeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberTextArea.append("-");
                frame.revalidate();
                frame.repaint();
            }
        });

        DelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = NumberTextArea.getText();
                if (text.length() > 0) {
                    String newText = text.substring(0, text.length() - 1);
                    NumberTextArea.setText(newText);
                }

                frame.revalidate();
                frame.repaint();
            }
        });

        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = NumberTextArea.getText();
                if(text.length() > 0) {
                    NumberTextArea.setText("");
                }


                frame.revalidate();
                frame.repaint();
            }
        });

        //start the operations with sum functions
        PlusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NumberTextArea.append("+");
                frame.revalidate();
                frame.repaint();

                EqualButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\+");
                        float sum=0;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) sum+=Integer.valueOf(text[i]);
                            else sum +=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(sum));
                        frame.revalidate();
                        frame.repaint();
                    }
                });


                CrossButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\+");
                        float sum=0;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) sum+=Integer.valueOf(text[i]);
                            else sum +=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(sum));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                MinusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\+");
                        float sum=0;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) sum+=Integer.valueOf(text[i]);
                            else sum +=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(sum));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                DivisionButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\+");
                        float sum=0;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) sum+=Integer.valueOf(text[i]);
                            else sum +=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(sum));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                PowerButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\+");
                        float sum=0;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) sum+=Integer.valueOf(text[i]);
                            else sum +=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(sum));
                        frame.revalidate();
                        frame.repaint();
                    }
                });



            }
        });

        //now we are going for cross function

        CrossButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NumberTextArea.append("*");
                frame.revalidate();
                frame.repaint();

                EqualButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\*");
                        float cross =1;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) cross*=Integer.valueOf(text[i]);
                            else cross *=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(cross));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                PlusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\*");
                        float cross =1;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) cross*=Integer.valueOf(text[i]);
                            else cross *=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(cross));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                MinusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\*");
                        float cross =1;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) cross*=Integer.valueOf(text[i]);
                            else cross *=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(cross));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                DivisionButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\*");
                        float cross =1;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) cross*=Integer.valueOf(text[i]);
                            else cross *=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(cross));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                PowerButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\*");
                        float cross =1;
                        for (int i =0; i < text.length;i++){
                            if(IsInteger(text[i])) cross*=Integer.valueOf(text[i]);
                            else cross *=Float.valueOf(text[i]);

                        }


                        NumberTextArea.setText(String.valueOf(cross));
                        frame.revalidate();
                        frame.repaint();
                    }
                });



            }
        });

        //now its time for minus funcrtion.


        MinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NumberTextArea.append("-");
                frame.revalidate();
                frame.repaint();

                EqualButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\-");
                        float Min=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            if(IsInteger(text[i])) Min-=Integer.valueOf(text[i]);
                            else Min -=Float.valueOf(text[i]);

                        }

                        NumberTextArea.setText(String.valueOf(Min));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                PlusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\-");
                        float Min=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            if(IsInteger(text[i])) Min-=Integer.valueOf(text[i]);
                            else Min -=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Min));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                CrossButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\-");
                        float Min=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            if(IsInteger(text[i])) Min-=Integer.valueOf(text[i]);
                            else Min -=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Min));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                DivisionButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\-");
                        float Min=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            if(IsInteger(text[i])) Min-=Integer.valueOf(text[i]);
                            else Min -=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Min));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                PowerButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\-");
                        float Min=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            if(IsInteger(text[i])) Min-=Integer.valueOf(text[i]);
                            else Min -=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Min));
                        frame.revalidate();
                        frame.repaint();
                    }
                });







            }
        });

        //division function:

        DivisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NumberTextArea.append("/");
                frame.revalidate();
                frame.repaint();

                EqualButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\/");
                        float Div=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Div/=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Div));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                PlusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\/");
                        float Div=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Div/=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Div));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                CrossButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\/");
                        float Div=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Div/=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Div));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                MinusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\/");
                        float Div=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Div/=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Div));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                PowerButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\/");
                        float Div=Float.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Div/=Float.valueOf(text[i]);

                        }
                        NumberTextArea.setText(String.valueOf(Div));
                        frame.revalidate();
                        frame.repaint();
                    }
                });





            }
        });

        //power function

        PowerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NumberTextArea.append("^");
                frame.revalidate();
                frame.repaint();

                EqualButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\^");
                        double Poww=Double.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Poww = Math.pow(Poww,Double.valueOf(text[i]));

                        }


                        NumberTextArea.setText(String.valueOf(Poww));
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                PlusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\^");
                        double Poww=Double.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Poww = Math.pow(Poww,Double.valueOf(text[i]));

                        }


                        NumberTextArea.setText(String.valueOf(Poww));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                CrossButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\^");
                        double Poww=Double.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Poww = Math.pow(Poww,Double.valueOf(text[i]));

                        }


                        NumberTextArea.setText(String.valueOf(Poww));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                MinusButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\^");
                        double Poww=Double.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Poww = Math.pow(Poww,Double.valueOf(text[i]));

                        }


                        NumberTextArea.setText(String.valueOf(Poww));
                        frame.revalidate();
                        frame.repaint();
                    }
                });

                DivisionButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = NumberTextArea.getText().split("\\^");
                        double Poww=Double.valueOf(text[0]);
                        for (int i =1; i < text.length;i++){
                            Poww = Math.pow(Poww,Double.valueOf(text[i]));

                        }


                        NumberTextArea.setText(String.valueOf(Poww));
                        frame.revalidate();
                        frame.repaint();
                    }
                });




            }
        });






        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

