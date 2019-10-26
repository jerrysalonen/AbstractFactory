package abstractfactory;
import java.lang.reflect.*;
/**
 * @author Jerry Salonen
 */
public class AdidasFactory extends AbstractFactory {

    public Clothes create(String clothesType) {
        // Create new clothes object dynamically by name
        try {
            String className = "abstractfactory." + clothesType;
            Class cls = Class.forName(className);
            Class constrTypes[] = {String.class};
            Constructor ct = cls.getConstructor(constrTypes);
            Object arglist[] = {"Adidas"};
            Object clothesObj = ct.newInstance(arglist);
            return (Clothes) clothesObj;
        }
        catch (Throwable e) {
            System.err.println(e);
        }

        return null;
    }

}
