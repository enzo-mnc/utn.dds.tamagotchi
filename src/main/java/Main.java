import Opcion2.Aburrida2;
import Opcion2.Estado2;
import Opcion2.Mascota2;


public class Main {

    public static void main(String[] args){

        Mascota2 tamagotchi = new Mascota2();
        System.out.println("Condicion inicial:");
        System.out.println(tamagotchi.getCondicion());

        for(int i=0;i < 5; i ++){
            tamagotchi.jugar();
        }
        System.out.println("Luego de jugar 5 veces:");
        System.out.println(tamagotchi.getCondicion());
        System.out.println(tamagotchi.puedoJugar());

        tamagotchi.jugar();
        System.out.println("Jugando hambrienta, no deberia hacer nada:");
        System.out.println(tamagotchi.getCondicion());

        tamagotchi.comer();
        System.out.println("Luego de comer estando hambrienta:");
        System.out.println(tamagotchi.getCondicion());

        tamagotchi.cambiarEstado(new Aburrida2(0));
        System.out.println("Cambio estado a aburrida:");
        System.out.println(tamagotchi.getCondicion());
        System.out.println(tamagotchi.puedoJugar());

        tamagotchi.comer();
        System.out.println("Come estando aburrida hace menos de 80 min, no deberia hacer nada:");
        System.out.println(tamagotchi.getCondicion());

        tamagotchi.cambiarEstado(new Aburrida2(90));
        tamagotchi.comer();
        System.out.println("Come estando aburrida hace mas de 80 min:");
        System.out.println(tamagotchi.getCondicion());

        tamagotchi.cambiarEstado(new Aburrida2(0));
        tamagotchi.jugar();
        System.out.println("Juega estando aburrida:");
        System.out.println(tamagotchi.getCondicion());



    }
}
