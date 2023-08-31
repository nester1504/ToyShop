import java.util.List;

public class ToyShopApp {
    public static void main(String[] args) {
        // Создание объекта ToyShop для управления магазином игрушек
        ToyShop toyShop = new ToyShop();

        // Создание объектов различных типов игрушек
        Toy teddyBear = new TeddyBear(1, 10, 20);
        Toy doll = new Doll(2, 15, 15);
        Toy actionFigure = new ActionFigure(3, 20, 10);
        Toy legoSet = new LegoSet(4, 5, 30);
        Toy puzzle = new Puzzle(5, 12, 12);
        Toy remoteCar = new RemoteControlCar(6, 8, 25);
        Toy coloringBook = new ColoringBook(7, 25, 5);
        Toy boardGame = new BoardGame(8, 10, 18);

        // Добавление созданных игрушек в магазин
        toyShop.addToy(teddyBear);
        toyShop.addToy(doll);
        toyShop.addToy(actionFigure);
        toyShop.addToy(legoSet);
        toyShop.addToy(puzzle);
        toyShop.addToy(remoteCar);
        toyShop.addToy(coloringBook);
        toyShop.addToy(boardGame);

        // Обновление веса игрушки с id 1 на 25
        toyShop.updateToyWeight(1, 25);

        // Организация розыгрыша призов
        toyShop.organizePrizeDraw();

        // Выдача приза
        toyShop.issuePrize();

        // Отображение очереди призов
        displayPrizeQueue(toyShop);
    }

    /**
     * Отображает очередь призов, ожидающих выдачи, из магазина.
     *
     * @param toyShop Магазин игрушек, из которого будет отображена очередь призов.
     */
    public static void displayPrizeQueue(ToyShop toyShop) {
        // Получение списка призовых игрушек из магазина
        List<Toy> prizeQueue = toyShop.getPrizeQueue();

        // Проверка, есть ли призовые игрушки в очереди
        if (prizeQueue.isEmpty()) {
            System.out.println("There are no prizes to issue.");
        } else {
            System.out.println("Prizes to be issued:");
            // Перебор призовых игрушек и их отображение
            for (Toy toy : prizeQueue) {
                System.out.println("- " + toy.getName());
            }
        }
    }
}