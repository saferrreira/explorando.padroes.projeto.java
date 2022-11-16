package one.digitalinnovation.java.gof;

import one.digitalinnovation.java.gof.Singleton.SingletonEager;
import one.digitalinnovation.java.gof.Singleton.SingletonLazy;
import one.digitalinnovation.java.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.java.gof.facade.Facade;
import one.digitalinnovation.java.gof.strategy.Comportamento;
import one.digitalinnovation.java.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.java.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.java.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.java.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        
        //Singleton:
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Sabrina", "14801788");

    }
    
}
