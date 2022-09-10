public class CarData {
    private int godVypuska;
    private String model;
    private int price;
    private String color;

    public CarData(int godVypuska, String model, int price, String color) {
        this.godVypuska = godVypuska;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public void setGodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "godVypuska=" + godVypuska +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
