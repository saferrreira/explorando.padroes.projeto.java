package one.digitalinnovation.java.gof.Singleton;

/**
 *  Singleton "apressado".
 * 
 * @author saferreira
 */

public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
    
}