public class Hyperplane {
    public int dimensions;
    public double[] w;

    // Creates a random hyperplane in the given dimensions
    public Hyperplane(int dimensions) {
        this.dimensions = dimensions;
        this.w = new double[dimensions + 1];
        for (int i = 0; i < dimensions + 1; i++) {
            this.w[i] = Math.random() * 2 - 1;
        }
    }

    public double dotProduct(Datapoint datapoint) {
        assert datapoint.dimensions == dimensions;
        double result = 0;
        for (int i = 0; i < dimensions + 1; i++) {
            result += w[i] * datapoint.features[i];
        }
        return result;
    }

    // Should the given datapoint be classified as positive? Or in other words: should the customer be approved for a loan?
    public int classify(Datapoint datapoint) {
        assert datapoint.dimensions != 0 && datapoint.features[0] == 1;
        return dotProduct(datapoint) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < dimensions + 1; i++) {
            if (i != 0) sb.append(", ");
            sb.append("w" + i + ": ");
            sb.append(String.format("%.2f", w[i]));
        }
        sb.append("}");
        return sb.toString();
    }
}
