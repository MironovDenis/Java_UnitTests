package seminar1.homework1.Shop;

import static org.assertj.core.api.Assertions.*;
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {
    public static void main(String[] args) {
        Shop productShop = new Shop();
        Product eggs = new Product("Eggs", 150);
        Product juice = new Product("Juice", 100);
        Product meat = new Product("Meat", 400);
        Product apple = new Product("Apple", 230);

        productShop.getProducts().add(eggs);
        productShop.getProducts().add(juice);
        productShop.getProducts().add(meat);
        productShop.getProducts().add(apple);

        System.out.println(productShop.getProducts());

        /**
         * 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
         */
        assertThat(productShop).isNotNull();
        assertThat(productShop.getProducts()).contains(eggs, juice, meat, apple).hasSize(4);

        /**
         * 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
         */
        assertThat(productShop.getMostExpensiveProduct()).isEqualTo(meat);
        assertThat(productShop.getMostExpensiveProduct().getCost()).isEqualTo(400);

        /**
         * 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
         */
        //System.out.println(productShop.sortProductsByPrice(productShop.getProducts()));
        assertThat(productShop.sortProductsByPrice(productShop.getProducts()).getFirst()).isEqualTo(juice);
        assertThat(productShop.sortProductsByPrice(productShop.getProducts())).containsSequence(juice, eggs, apple, meat);


    }

}