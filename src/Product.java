import java.util.Objects;

public class Product {
    private String name;
    private double cost;
    private Type type;
    private double size;


    public Product(String name, double cost, Type type, double size) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public Type getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", type=" + type +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 &&
                Double.compare(product.size, size) == 0 &&
                Objects.equals(name, product.name) &&
                type == product.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, type, size);
    }
}
