class ColoringBook extends Toy {
    public ColoringBook(int id, int quantity, double weight) {
        super(id, "Coloring Book", quantity, weight);
    }

    @Override
    public String getType() {
        return "Art Supply";
    }
}