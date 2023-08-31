class ActionFigure extends Toy {
    public ActionFigure(int id, int quantity, double weight) {
        super(id, "Action Figure", quantity, weight);
    }

    @Override
    public String getType() {
        return "Action Figure";
    }
}