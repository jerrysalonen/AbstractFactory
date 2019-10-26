package abstractfactory;

/**
 * @author Jerry Salonen
 */
public class Shirt implements Clothes {

    String name;
    String brand;

    public Shirt(String brand) {
        this.name = "T-Paita";
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.name;
    }
}
