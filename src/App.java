public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 2; i <= 10; i++) {
            run(i, 1000);
        }

        System.out.println("STRESS TEST! 50D hyperplane with 500,000 datapoints!\n");
        run(50, 500000);
    }

    public static void run(int dimensions, int numDatapoints) {
        System.out.println("Creating " + numDatapoints + " random datapoints in " + dimensions + " dimensions");
        Hyperplane goalHyperplane = new Hyperplane(dimensions);
        Datapoint[] datapoints = new Datapoint[numDatapoints];
        for (int i = 0; i < numDatapoints; i++) {
            datapoints[i] = new Datapoint(dimensions);
        }

        int positiveClassifications = 0;
        int negativeClassifications = 0;

        for (Datapoint datapoint : datapoints) {
            if (goalHyperplane.classify(datapoint) == 1) {
                positiveClassifications++;
                datapoint.label = 1;
            } else {
                negativeClassifications++;
                datapoint.label = -1;
            }
        }

        System.out.println("Positive classifications: " + positiveClassifications);
        System.out.println("Negative classifications: " + negativeClassifications);

        System.out.println("Attempting to run the perceptron algorithm to find the hyperplane...");
        Hyperplane hyperplane = new Hyperplane(dimensions);
        long startTime = System.currentTimeMillis();
        int stepsNeeded = Perceptron.train(hyperplane, datapoints);
        long endTime = System.currentTimeMillis();

        
        double normalizationRatio = hyperplane.w[0] / goalHyperplane.w[0];
        for (int i = 0; i < dimensions + 1; i++) {
            hyperplane.w[i] /= normalizationRatio;
        }

        System.out.println("Success! The perceptron algorithm took " + stepsNeeded + " steps to find the hyperplane. Time elapsed: " + (endTime - startTime) + "ms");
        System.out.println("True hyperplane f(x): " + goalHyperplane);
        System.out.println("Trained hyperplane g(x): " + hyperplane);

        double error = 0;
        for (int i = 0; i < dimensions + 1; i++) {
            double delta = goalHyperplane.w[i] - hyperplane.w[i];
            error += delta * delta;
        }
        error /= dimensions;
        System.out.println("Average error^2 vector of final hyperplane: " + error + " (lower is better)");
        
        System.out.println();
    }
}
