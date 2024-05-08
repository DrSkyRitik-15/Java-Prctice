import java.util.*;
class Animal{
    void eat()
    {
        System.out.println("Animal is eating ");
    }
}
class Rat extends Animal{
    void eat(){
        System.out.println("Rat is eating ");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("Cow is eating ");
    }
}
public class Ok {
    public static void print(List<? extends Animal>ola)
    {
        for(Animal a:ola)
        {
            a.eat();
        }
        
    }
    
    public static void main(String[] args) {
       List<Animal> Obj=new ArrayList<Animal>() ;
       Obj.add(new Animal()) ;
       List<Rat> Obj1=new ArrayList<>() ;
       Obj1.add(new Rat()) ;
       List<Cow> Obj2=new ArrayList<>() ;
       Obj2.add(new Cow()) ;
       Obj2.add(new Cow()) ;
       
       print(Obj);
       print(Obj1);
       print(Obj2);
    }
}
