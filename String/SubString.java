public class SubString {
    public static void main(String[] args) {
        String a = "kishan kumar singh";
        String b = "";
        int len = a.length();
        for(int i = 0 ; i < len ; i++){
            if(a.charAt(i)!='a'){
                b = b + a.charAt(i);
            }
        }
        System.out.println(b);
    }
}
