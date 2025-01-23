
package POO_Ejercicios;

public class Base {
    public static void main(String[] args){
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasor bulbasor = new Bulbasor();
        Pikachu pikachu = new Pikachu();
        
        squirtle.acatacarBurbuja();
        squirtle.atacarAraniazo();
        charmander.acatacarAscuas();
        charmander.atacarAraniazo();
        bulbasor.acatacarDrenaje();
        bulbasor.atacarAraniazo();
        pikachu.atacarAraniazo();
        pikachu.acatacarImpactrueno();
    }
}
