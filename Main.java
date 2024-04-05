import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

=======
        
        Caja caja1 = new Caja(3, 4,3);
        Caja caja2 = new Caja(4, 10,5);
        caja2.alto = 100;
>>>>>>> 9006afd (main modificado)

        Coche coche1 = new Coche("Opel", "Corsa", "Azul", 0, 150);

        String marca = sc.nextLine();
        String modelo = sc.nextLine();
        String color = sc.nextLine();
        double velocidad = sc.nextDouble();
        double velocidadMax = sc.nextDouble();

        Coche cocheNuevo = new Coche(marca, modelo, color, velocidad, velocidadMax);

        if(cocheNuevo.velocidadMax>coche1.velocidadMax){
            System.out.println("El coche nuevo es mas rapido que el coche 1");
        }
        sc.close();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 9006afd (main modificado)
