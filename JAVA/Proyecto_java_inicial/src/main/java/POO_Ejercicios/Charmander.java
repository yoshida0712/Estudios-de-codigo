
package POO_Ejercicios;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander, Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander, Mordisco");
    }

    @Override
    public void acatacarPunoFuego() {
        System.out.println("Charmander, PunoFuego");
    }

    @Override
    public void acatacarLanzallamas() {
        System.out.println("Charmander, Lanzallamas");
    }

    @Override
    public void acatacarAscuas() {
        System.out.println("Charmander, Ascuas");
    }
    
}
