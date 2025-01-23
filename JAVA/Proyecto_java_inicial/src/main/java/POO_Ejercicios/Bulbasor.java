
package POO_Ejercicios;

public class Bulbasor extends Pokemon implements IPlanta{

    public Bulbasor() {
    }    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("bulbasor, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("bulbasor, arañaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("bulbasor, mordisco");
    }

    @Override
    public void acatacarDrenaje() {
        System.out.println("bulbasor, Drenaje");
    }

    @Override
    public void acatacarParalizar() {
        System.out.println("bulbasor, Paralizar");
    }
     
}
