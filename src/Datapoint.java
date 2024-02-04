public class Datapoint {
    public int dimensions;
    public double[] features;
    public int label;

    public Datapoint(int dimensions) {
        this.dimensions = dimensions;
        populateCoordinates();
    }

    public void populateCoordinates() {
        this.features = new double[dimensions + 1];
        this.features[0] = 1;
        for (int i = 1; i < dimensions + 1; i++) {
            this.features[i] = Math.random() * 2 - 1;
        }
    }
}
