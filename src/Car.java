public class Car {
    private String id;
    private int numberAvto;

    public Car(String id, int numberAvto) {
        this.id = id;
        this.numberAvto = numberAvto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberAvto() {
        return numberAvto;
    }

    public void setNumberAvto(int numberAvto) {
        this.numberAvto = numberAvto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", numberAvto=" + numberAvto +
                '}';
    }
}
