abstract class Toy {
    private int id;         // Идентификатор игрушки
    private String name;    // Название игрушки
    private int quantity;   // Количество доступных игрушек
    private double weight;  // Вес игрушки

    /**
     * Конструктор класса Toy.
     *
     * @param id Идентификатор игрушки.
     * @param name Название игрушки.
     * @param quantity Количество доступных игрушек.
     * @param weight Вес игрушки.
     */
    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    /**
     * Возвращает идентификатор игрушки.
     *
     * @return Идентификатор игрушки.
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает название игрушки.
     *
     * @return Название игрушки.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает количество доступных игрушек.
     *
     * @return Количество доступных игрушек.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Возвращает вес игрушки.
     *
     * @return Вес игрушки.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Устанавливает новый вес игрушки.
     *
     * @param weight Новый вес игрушки.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Уменьшает количество доступных игрушек на 1.
     */
    public void reduceQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }

    /**
     * Абстрактный метод для получения типа игрушки.
     *
     * @return Тип игрушки.
     */
    public abstract String getType();
}