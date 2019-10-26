package abstractfactory;
/**
 * @author Jerry Salonen
 */
public class Main {

    public static void main(String[] args) {

	    AbstractFactory factory = new BossFactory();

	    Clothes hat = (Clothes) factory.create("Hat");
		Clothes shirt = (Clothes) factory.create("Shirt");
		Clothes pants = (Clothes) factory.create("Pants");
		Clothes shoes = (Clothes) factory.create("Shoes");

	    System.out.println("Hei, olen Jasperi.\nTässä minun vaatteeni!");
	    System.out.println(hat.toString());
		System.out.println(shirt.toString());
		System.out.println(pants.toString());
		System.out.println(shoes.toString());
    }
}
