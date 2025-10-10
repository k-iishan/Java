public class Pattern {
    public static void main(String[] args) {
        String a = "abcd";
        for(int i = 0 ; i < a.length(); i++){
            for(int j = i+1 ; j < a.length()+1;j++){
                System.out.print(a.substring(i, j)+ "\n");
            }
        }
    }
}
