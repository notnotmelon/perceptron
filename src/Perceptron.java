public class Perceptron {
    public static int train(Hyperplane hyperplane, Datapoint[] datapoints) {
        int steps = 0;
        while (true) {
            boolean allCorrect = true;
            for (Datapoint datapoint : datapoints) {
                if (hyperplane.classify(datapoint) != datapoint.label) {
                    allCorrect = false;
                    for (int i = 0; i < hyperplane.dimensions + 1; i++) {
                        hyperplane.w[i] += datapoint.label * datapoint.features[i];
                    }
                }
            }
            if (allCorrect) break;
            steps++;
        }
        return steps;
    }
}