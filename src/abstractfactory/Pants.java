package abstractfactory;

/**
 * @author Jerry Salonen
 */
public class Pants implements Clothes {

    String name;
    String brand;

    public Pants(String brand) {
        this.name = "Farmarit";
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.name;
    }
}
