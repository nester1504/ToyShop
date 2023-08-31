class LegoSet extends Toy {
    public LegoSet(int id, int quantity, double weight) {
        super(id, "Lego Set", quantity, weight);
    }

    @Override
    public String getType() {
        return "Building Toy";
    }
}