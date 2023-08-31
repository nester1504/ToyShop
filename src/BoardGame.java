class BoardGame extends Toy {
    public BoardGame(int id, int quantity, double weight) {
        super(id, "Board Game", quantity, weight);
    }

    @Override
    public String getType() {
        return "Tabletop Game";
    }
}