package abstractfactory;

/**
 * @author Jerry Salonen
 */
public class Shoes implements Clothes {

    String name;
    String brand;

    public Shoes(String brand) {
        this.name = "Kengät";
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.name;
    }
}
