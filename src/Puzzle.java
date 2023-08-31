class Puzzle extends Toy {
    public Puzzle(int id, int quantity, double weight) {
        super(id, "Puzzle", quantity, weight);
    }

    @Override
    public String getType() {
        return "Brain Teaser";
    }
}