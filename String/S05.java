import java.util.Scanner;

public class S05 {
   public static void Kishan(Scanner a ){
  int x = a.nextInt();
  int y = a.nextInt();
  System.out.println(x*y);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      Kishan(input); 
      input.close(); 
    }
}
