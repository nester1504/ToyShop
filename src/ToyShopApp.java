import java.util.ArrayList;
import java.util.List;

public class ToyShopApp {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        Toy toy1 = new TeddyBear(1, 10, 20);
        Toy toy2 = new Doll(2, 15, 15);
        Toy toy3 = new ActionFigure(3, 20, 10);

        toyShop.addToy(toy1);
        toyShop.addToy(toy2);
        toyShop.addToy(toy3);

        toyShop.updateToyWeight(1, 25);

        toyShop.organizePrizeDraw();
        toyShop.issuePrize();

        displayPrizeQueue(toyShop);
    }

    public static void displayPrizeQueue(ToyShop toyShop) {
        List<Toy> prizeQueue = toyShop.getPrizeQueue();
        if (prizeQueue.isEmpty()) {
            System.out.println("There are no prizes to issue.");
        } else {
            System.out.println("Prizes to be issued:");
            for (Toy toy : prizeQueue) {
                System.out.println("- " + toy.getName());
            }
        }
    }
}