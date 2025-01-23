
package POO_Ejercicios;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu, Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu, Mordisco");
    }

    @Override
    public void acatacarImpactrueno() {
        System.out.println("Pikachu, Impactrueno");
    }

    @Override
    public void acatacarPuenTrueno() {
        System.out.println("Pikachu, PuenTrueno");
    }
    
}
