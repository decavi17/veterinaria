
package businessLogic;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Starter{

    public static void main(String[] args) throws FileNotFoundException{
        FileReader fr = new FileReader("D:\\Users\\Estudiante\\Documents\\pets.txt");
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("MENU");
        System.out.println("que desea hacer:");
        System.out.println("1. remover mascota");
        System.out.println("2. listar mascotas de una persona");
        System.out.println("3. listar mascotas segun su tipo");
        System.out.println("4. finalizar programa y listar mascotas");
        int opc = leer.nextInt();
        Vet metodo1 = new Vet();
        Person metodo2 = new Person();
        
        switch(opc){
            case 1:
                System.out.println("ingrese el id de la mascota que desea remover");
                    int opc1= leer.nextInt();
                metodo1.removePet();
            case 2:
                System.out.println("ingrese el id de la persona");
                    opc1 = leer.nextInt();
                metodo2.showPets();
                
            case 3:
                System.out.println("¿que tipo de mascota desea listar?");
                    opc1 = leer.nextInt();
                metodo1.showPetsByTipe();
            case 4:
                metodo1.showPets();
                System.out.println("el programa ha finalizado");
                
        
    }
    }


    
}
