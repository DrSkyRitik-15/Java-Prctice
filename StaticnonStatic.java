public class StaticnonStatic {
    static{
        System.out.println("Ritik singh kushwaha");

    }
    {
        System.out.println("Non ststic class");

    }
    {
        System.out.println("Non ststic class2");

    }
    public StaticnonStatic(){
        System.out.println("Love you");
    }
    public static void main(String[] args) {
        StaticnonStatic A=new StaticnonStatic();
        StaticnonStatic B=new StaticnonStatic();
    }
}
