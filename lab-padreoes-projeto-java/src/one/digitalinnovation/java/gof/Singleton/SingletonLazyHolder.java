package one.digitalinnovation.java.gof.Singleton;

/**
 *  Singleton "Lazy Holder".
 * 
 * @see <a href="htss://stackoverflow.com/a/24018148">Ref</a>
 * 
 * @author saferreira
 */

public class SingletonLazyHolder {

    private static class InstanceHolder{
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
    
}