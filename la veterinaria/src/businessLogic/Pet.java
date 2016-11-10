
package businessLogic;

public abstract class Pet {
    String ID;
    String name;
    String hairColor;
    String TypePet;
    
    public  void sound(){
        if(TypePet=="Dog"){
            System.out.println("guau");
        }
        if(TypePet=="Cat"){
            System.out.println("miau");
        }
        if(TypePet=="Hamster"){
            System.out.println("  ");
        }
        
            
        
    }
}
