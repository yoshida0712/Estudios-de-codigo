
package POO_Ejercicios;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle, Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle, Mordisco");
    }

    @Override
    public void acatacarHidrobomba() {
        System.out.println("Squirtle, Hidrobomba");
    }

    @Override
    public void acatacarBurbuja() {
        System.out.println("Squirtle, Burbuja");
    }

    @Override
    public void acatacarPistolaAgua() {
        System.out.println("Squirtle, PistolaAgua");
    }
    
}
