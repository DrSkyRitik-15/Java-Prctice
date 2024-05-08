class Book<T>
{
    T a;
    public void print(T a){
        this.a=a;
        System.out.println("The number or String is = "+a);
    }
}
// package Genric;

/**
 * Normal
 */
public class Normal {
public static void main(String[] args) {
    Book<Integer> b1=new Book<>();
    b1.print(10);
    Book<String> b2=new Book<>();
    b2.print("Hello");
    Book<Double> d=new Book<>();
    d.print(10.5);
}
    
}