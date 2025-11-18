public class Br01 {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        printpat("", 3, 3);
    }
    static int count(int x , int y){
        if(x ==1 || y ==1){
            return 1;
        }
        int left = count(x -1, y);
        int right = count(x, y-1);
        return left + right ;
    }
    static void printpat(String p ,int x , int y){
        if(x ==1 && y ==1){
            System.out.println(p);
        }
        if(x>1){
           p = p +'R';
           printpat(p, x-1, y);
        }
        if(y>1){
             p = p +'D';
           printpat(p, x, y-1);
        }
    }
    static
}
