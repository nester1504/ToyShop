class Doll extends Toy {
    public Doll(int id, int quantity, double weight) {
        super(id, "Doll", quantity, weight);
    }

    @Override
    public String getType() {
        return "Doll";
    }
}