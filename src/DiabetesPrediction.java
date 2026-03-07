
    import java.util.Random;
    public class DiabetesPrediction {

        static double sigmoid(double z) {
            return 1 / (1 + Math.exp(-z));
        }
        public static String predict(double age, double bmi) {
            if (bmi > 30) {
                return "Patient may have Diabetes";
            } else {
                return "Patient is Normal";
            }
        }



        public static void main(String[] args) {

            // Example dataset (AGE, BMI, HbA1c, Diabetes Result)
            double[][] X = {
                    {45, 28, 7.2},
                    {50, 30, 8.1},
                    {23, 22, 5.5},
                    {60, 35, 9.0},
                    {35, 25, 6.0}
            };

            int[] y = {1, 1, 0, 1, 0}; // 1 = Diabetes, 0 = No Diabetes

            int m = X.length;
            int n = X[0].length;

            double[] weights = new double[n];
            double bias = 0;

            double learningRate = 0.001;
            int epochs = 1000;

            Random rand = new Random();

            // Initialize weights
            for (int i = 0; i < n; i++) {
                weights[i] = rand.nextDouble();
            }

            // Training
            for (int epoch = 0; epoch < epochs; epoch++) {

                for (int i = 0; i < m; i++) {

                    double z = bias;

                    for (int j = 0; j < n; j++) {
                        z += weights[j] * X[i][j];
                    }

                    double prediction = sigmoid(z);
                    double error = prediction - y[i];

                    for (int j = 0; j < n; j++) {
                        weights[j] -= learningRate * error * X[i][j];
                    }

                    bias -= learningRate * error;
                }
            }

            // Test with new patient
            double[] newPatient = {40, 29, 7.0};

            double z = bias;
            for (int j = 0; j < n; j++) {
                z += weights[j] * newPatient[j];
            }

            double result = sigmoid(z);

            if (result >= 0.5) {
                System.out.println("Prediction: Patient has Diabetes");
            } else {
                System.out.println("Prediction: Patient is Normal");
            }

            System.out.println("Probability: " + result);
        }
    }

