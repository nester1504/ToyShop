class TeddyBear extends Toy {
    public TeddyBear(int id, int quantity, double weight) {
        super(id, "Teddy Bear", quantity, weight);
    }

    @Override
    public String getType() {
        return "Stuffed Animal";
    }
}