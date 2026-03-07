import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DiabetesGUI {
            public static void main(String[] args) {

                JFrame frame = new JFrame("Diabetes Prediction");
                frame.setSize(500,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Background Image
                ImageIcon bg = new ImageIcon("hospital.jpeg");
                JLabel background = new JLabel(bg);
                background.setBounds(0,0,500,400);
                frame.setContentPane(background);
                background.setLayout(null);

                // Age Label
                JLabel ageLabel = new JLabel("Age:");
                ageLabel.setBounds(120,80,100,30);
                background.add(ageLabel);

                // Age Field
                JTextField ageField = new JTextField();
                ageField.setBounds(200,80,150,30);
                background.add(ageField);

                // BMI Label
                JLabel bmiLabel = new JLabel("BMI:");
                bmiLabel.setBounds(120,130,100,30);
                background.add(bmiLabel);

                // BMI Field
                JTextField bmiField = new JTextField();
                bmiField.setBounds(200,130,150,30);
                background.add(bmiField);

                // Predict Button
                JButton predictBtn = new JButton("Predict");
                predictBtn.setBounds(200,190,100,40);
                background.add(predictBtn);

                // Result Label
                JLabel resultLabel = new JLabel("");
                resultLabel.setBounds(180,250,250,30);
                background.add(resultLabel);

                // Button Action
                predictBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        int age = Integer.parseInt(ageField.getText());
                        double bmi = Double.parseDouble(bmiField.getText());

                        String result = DiabetesPrediction.predict(age, bmi);

                        resultLabel.setText(result);
                    }
                });

                frame.setVisible(true);
            }
        }


