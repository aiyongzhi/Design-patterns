package 设计模式之禅.开闭原则;

public class ComputerBook implements IComputerBook{
    private String name;
    private double price;
    private String author;
    private String scope;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ComputerBook(String name, double price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getScope() {
        return this.scope;
    }
    @Override
    public String toString() {
        return "ComputerBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
