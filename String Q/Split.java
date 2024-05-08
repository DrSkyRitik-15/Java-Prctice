import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        String str = "Hello, how are you";
        Scanner scanner=new Scanner(System.in);
        String []input=scanner.nextLine().split(" ");
            System.out.println(input.length); 
            for (String string : input) {
                
                System.out.print(string); // Hello, h
            }
        }

    }

