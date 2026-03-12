import javax.swing.*;
import java.awt.event.*;
public class DiabetesPredictionGUI {
        // Example logistic regression weights
        static double w1 = 0.2;
        static double w2 = 0.03;
        static double w3 = 0.02;
        static double w4 = 0.01;
        static double w5 = 0.02;
        static double w6 = 0.04;
        static double w7 = 0.5;
        static double w8 = 0.01;
        static double bias = -5;

        public static double sigmoid(double z) {
            return 1.0 / (1.0 + Math.exp(-z));
        }

        public static String predict(double[] values) {

            double z = (w1 * values[0]) +
                    (w2 * values[1]) +
                    (w3 * values[2]) +
                    (w4 * values[3]) +
                    (w5 * values[4]) +
                    (w6 * values[5]) +
                    (w7 * values[6]) +
                    (w8 * values[7]) +
                    bias;

            double probability = sigmoid(z);

            if (probability > 0.5)
                return "Diabetic";
            else
                return "Non Diabetic";
        }

        public static void main(String[] args) {

            JFrame frame = new JFrame("Diabetes Prediction System");
            frame.setSize(400,500);
            frame.setLayout(null);

            String[] labels = {
                    "Pregnancies","Glucose","Blood Pressure",
                    "Skin Thickness","Insulin","BMI",
                    "Diabetes Pedigree","Age"
            };

            JTextField[] fields = new JTextField[8];

            for(int i=0;i<labels.length;i++) {

                JLabel label = new JLabel(labels[i]);
                label.setBounds(50,30 + i*40,150,25);
                frame.add(label);

                fields[i] = new JTextField();
                fields[i].setBounds(200,30 + i*40,120,25);
                frame.add(fields[i]);
            }

            JButton predictBtn = new JButton("Predict");
            predictBtn.setBounds(130,360,120,40);
            frame.add(predictBtn);

            JLabel result = new JLabel("");
            result.setBounds(130,420,200,30);
            frame.add(result);

            predictBtn.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    try {

                        double[] values = new double[8];

                        for(int i=0;i<8;i++) {
                            values[i] = Double.parseDouble(fields[i].getText());
                        }

                        String prediction = predict(values);

                        result.setText("Result: " + prediction);

                    } catch(Exception ex) {

                        JOptionPane.showMessageDialog(frame,
                                "Please enter valid numbers");
                    }
                }
            });

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }

