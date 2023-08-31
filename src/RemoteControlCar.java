class RemoteControlCar extends Toy {
    public RemoteControlCar(int id, int quantity, double weight) {
        super(id, "Remote Control Car", quantity, weight);
    }

    @Override
    public String getType() {
        return "RC Toy";
    }
}