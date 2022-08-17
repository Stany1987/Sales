package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    private Product model;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.


    public SalesView(String title, String name, int quantity, double price, Scanner scanner, Product model) {
        this.title = title;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.scanner = scanner;
        this.model = model;
    }

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println("Введите наименование товара: ");
        model.setName(Validator.validateName(scanner));

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println("Введите количество: ");
        model.setQuantity(Validator.validateQuantityInput(scanner));

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println("Введите цену: ");
        model.setPrice(Validator.validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
