import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyShop {
    private List<Toy> toys;
    private List<Toy> prizeQueue;

    public ToyShop() {
        toys = new ArrayList<>();
        prizeQueue = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void organizePrizeDraw() {
        Random random = new Random();
        double totalWeight = toys.stream().mapToDouble(Toy::getWeight).sum();

        while (!toys.isEmpty()) {
            double randomValue = random.nextDouble() * totalWeight;
            double cumulativeWeight = 0;

            for (Toy toy : toys) {
                cumulativeWeight += toy.getWeight();
                if (randomValue <= cumulativeWeight) {
                    prizeQueue.add(toy);
                    toy.reduceQuantity();
                    totalWeight -= toy.getWeight();
                    break;
                }
            }
        }
    }

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
}