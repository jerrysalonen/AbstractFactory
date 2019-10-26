package abstractfactory;

/**
 * @author Jerry Salonen
 */
public abstract class AbstractFactory<T> {
    abstract T create(String clothesType);
}
