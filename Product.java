public abstract class Product {

    String name;
    int price;
    int rate;

    abstract  double calcPrice();
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
}
