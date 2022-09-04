import java.util.Scanner;
public class HelloGoodbye {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        System.out.println("Hello " + name1+" "+name2+".");
        System.out.println("Goodbye " + name2+" "+name1+".");
    }
}
