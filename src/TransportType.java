public enum TransportType {
    CAR(0.1),
    BUS(0.05),
    TRUCK(0.02);

    private double price;

    TransportType(double price) {
        this.price = price;
    }

    public double calculateTravelCost(double distance){
        double num = distance * price;
        return num;
    }



}
