# Игрушечный магазин

Приветствую вас! Это пример программы, представляющей собой игрушечный магазин, написанный на языке Java с использованием ООП и работой с файлами.

## Описание

Программа моделирует работу игрушечного магазина, предоставляя возможность добавления, изменения параметров и розыгрыша разнообразных игрушек. Внутренняя структура магазина и игрушек организована с использованием принципов объектно-ориентированного программирования.

## Функциональность

- Добавление новых игрушек в магазин.
- Обновление веса игрушек.
- Организация розыгрыша призовых игрушек.
- Выдача призовых игрушек и запись в файл.
- Вывод списка призовых игрушек для выдачи.

## Как использовать

1. Клонируйте репозиторий на свой компьютер.
2. Откройте проект в вашей среде разработки (например, IntelliJ IDEA или Eclipse).
3. Запустите класс `ToyShopApp`, чтобы протестировать функциональность.

## Структура проекта

- `ToyShopApp.java`: Основной класс, содержащий точку входа и демонстрацию функциональности.
- `ToyShop.java`: Класс, представляющий игрушечный магазин и его операции.
- `Toy.java`: Абстрактный класс, описывающий базовую структуру игрушки.
- Классы, наследующие `Toy`: `TeddyBear`, `Doll`, `ActionFigure` и другие, представляющие различные типы игрушек.