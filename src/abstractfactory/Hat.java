package abstractfactory;

/**
 * @author Jerry Salonen
 */
public class Hat implements Clothes {

    String name;
    String brand;

    public Hat(String brand) {
        this.name = "Lippis";
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.name;
    }
}
