import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        //char[] arr = new char[10];
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(a);
        System.out.println(a.charAt(5));
        System.out.println(a.indexOf("az"));
    }
}
