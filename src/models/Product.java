package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;

    // Налоговоу ставку объявите в виде константы
    // здесь ...
    private final double taxRate = 5;

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxRate() {
        return taxRate;
    }


    // Переопределите методы реализуемых интерфейсов.
    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    @Override
    public double getIncome(int income, double price) {
        return quantity * price;
    }

    // Расчёт суммы налога с продаж.
    // здесь ...
    @Override
    public double getTaxIncome(double income, double taxRate) {
        return (income * taxRate) / 100;
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...

    @Override
    public double getCleanerIncom(double income, double taxRate) {
        return income - taxRate;
    }


}
