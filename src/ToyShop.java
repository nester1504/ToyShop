import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyShop {
    private List<Toy> toys;         // Список всех доступных игрушек в магазине
    private List<Toy> prizeQueue;   // Очередь призовых игрушек для выдачи

    /**
     * Конструктор класса ToyShop. Инициализирует списки игрушек и призовых игрушек.
     */
    public ToyShop() {
        toys = new ArrayList<>();
        prizeQueue = new ArrayList<>();
    }

    /**
     * Добавляет новую игрушку в магазин.
     *
     * @param toy Игрушка для добавления.
     */
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    /**
     * Обновляет вес игрушки с заданным идентификатором.
     *
     * @param toyId Идентификатор игрушки для обновления веса.
     * @param weight Новый вес игрушки.
     */
    public void updateToyWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    /**
     * Организует розыгрыш призовых игрушек.
     * Игрушки выбираются случайным образом с учетом их веса.
     */
    public void organizePrizeDraw() {
        Random random = new Random();
        List<Double> probabilityRanges = new ArrayList<>();
        double totalWeight = toys.stream().mapToDouble(Toy::getWeight).sum();

        double rangeStart = 0;
        for (Toy toy : toys) {
            double probability = toy.getWeight() / totalWeight;
            double rangeEnd = rangeStart + probability;
            probabilityRanges.add(rangeEnd);
            rangeStart = rangeEnd;
        }

        while (!toys.isEmpty()) {
            double randomValue = random.nextDouble();

            for (int i = 0; i < probabilityRanges.size(); i++) {
                if (randomValue <= probabilityRanges.get(i)) {
                    Toy selectedToy = toys.get(i);
                    prizeQueue.add(selectedToy);
                    selectedToy.reduceQuantity();
                    totalWeight -= selectedToy.getWeight();
                    toys.remove(i);
                    probabilityRanges.remove(i);
                    break;
                }
            }
        }
    }

    /**
     * Выдает призовую игрушку из очереди и записывает ее в файл.
     */
    public void issuePrize() {
        if (!prizeQueue.isEmpty()) {
            Toy prizeToy = prizeQueue.remove(0);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("issued_prizes.txt", true))) {
                writer.write(prizeToy.getName() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Возвращает копию списка призовых игрушек.
     *
     * @return Копия списка призовых игрушек.
     */
    public List<Toy> getPrizeQueue() {
        return new ArrayList<>(prizeQueue);
    }
}