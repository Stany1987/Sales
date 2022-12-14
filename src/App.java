import controllers.ProductController;
import models.Product;
import utils.Rounder;
import views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
        Product model = new Product(); //создать экземпляр
        SalesView view = new SalesView(model); //создать экземпляр
        ProductController controller = new ProductController(model, view);

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
        controller.runApp();
    }
}
