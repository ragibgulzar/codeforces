import java.util.Scanner;
 
public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] nums = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        
        while(t-- > 0){
            char[][] arr = new char[10][10];
            int ans = 0;
            for (int i = 0; i < 10; i++) {
                String row = sc.next();
                for (int j = 0; j < 10; j++) {
                    if(row.charAt(j)=='X'){
                        ans += nums[i][j];
                    }
 
                }
            }
 
            System.out.println(ans);
        }
    }
}