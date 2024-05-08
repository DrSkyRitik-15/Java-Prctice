class Ola<T extends Number>
{
    void print(T[]a )
    {
        for(T b:a){
            System.out.println(b);

        }
    }
}
/**
 * bound_type
 */
public class bound_type {

    public static void main(String[] args) {
        Ola<Integer> o=new Ola<>();
        Integer[] a={1,2,3,4,5};
        o.print(a);
        Ola<Float> f=new Ola<>();
        Float[] j={1.2f,1.5f,1.0f};
        f.print(j);
    }
}