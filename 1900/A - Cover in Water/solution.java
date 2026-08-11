import java.util.Scanner;
 
public class CoverInWater {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int dots = 0;
            int cont = 0;
            boolean hasThree = false;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='.'){
                    dots++;
                    cont++;
 
                    if(cont >= 3){
                        hasThree = true;
                    }
                } else{
                    cont = 0;
                }
            }
            if(dots == 0){
                System.out.println(0);
            } else if(hasThree){
                System.out.println(2);
            } else {
                System.out.println(dots);
            }
        }
    }
}