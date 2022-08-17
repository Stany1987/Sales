package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        model.getName();

        // 2) вызов методов расчетов доходов и налога;
        double income = model.getIncome(model.getQuantity(), model.getPrice());
        double taxIncome = model.getTaxIncome(income, model.getTaxRate());
        double cleanIncome = model.getCleanerIncom(income, taxIncome);
        // 3) округление расчетных значений;
        income = Rounder.round(income);
        taxIncome = Rounder.round(taxIncome);
        cleanIncome = Rounder.round(cleanIncome);
        // 4) вывод расчетов по заданному формату.
        String output = "Наименование товара: " + model.getName() +
                "\nОбщий доход (грн.): " + (String.format("%,.2f", income)) +
                "\nСумма налога (грн.): " + (String.format("%,.2f", taxIncome)) +
                "\nЧистый доход (грн.): " + (String.format("%,.2f", cleanIncome));
        view.getOutput(output);
    }
}
