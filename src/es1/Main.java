package es1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = getProducts();

        List<Product> expensiveBooks = productList.stream()
                .filter(product -> product.getCategory().equals("books"))
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());

        expensiveBooks.forEach(System.out::println);
    }

    public static List<Product> getProducts() {
        // Implementa la logica per ottenere una lista di prodotti
        // Esempio:
        return List.of(
                new Product(1L, "Book 1", "books", 120.0),
                new Product(2L, "Book 2", "books", 80.0),
                new Product(3L, "Book 3", "electronics", 150.0),
                new Product(4L, "Book 4", "books", 200.0)
        );
    }
}
