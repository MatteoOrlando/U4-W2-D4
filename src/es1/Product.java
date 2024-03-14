package es1;

public class Product {
    private Long id;
    private String name;
    private String category;
    private double price;

    public Product(Long id, String name, String category, double price) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Product{" +
                "id=" + id +
                ", name='" + name + '/' +
                ", category='" + category + '/' +
                ", price=" + price +
                '}';
    }
}
