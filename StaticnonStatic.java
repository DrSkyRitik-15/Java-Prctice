public class StaticnonStatic {
    static{
        System.out.println("Ritik singh kushwaha");

    }
    static{
        System.out.println("Ritik singh");

    }
    {
        System.out.println("Non ststic class");

    }
    {
        System.out.println("Non ststic222 class2");

    }
    public StaticnonStatic(){
        System.out.println("Love you");
    }
    public static void main(String[] args) {
        StaticnonStatic A=new StaticnonStatic();
        System.out.println("=================================");
        StaticnonStatic B=new StaticnonStatic();
    }
}
