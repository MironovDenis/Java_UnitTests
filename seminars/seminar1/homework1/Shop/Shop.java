package seminar1.homework1.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice(List<Product> products) {
        Collections.sort(this.products, (product1, product2) -> product1.getCost() - product2.getCost());
        return products;
        // Допишите реализацию метода самостоятельно
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        Product maxCostProduct = null;
        for (Product product : products){
            if (maxCostProduct == null || maxCostProduct.getCost() < product.getCost()){
                maxCostProduct = product;
            }
        }
        // Допишите реализацию метода самостоятельно
        return maxCostProduct;
    }

}