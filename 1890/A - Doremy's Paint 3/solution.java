import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class DoremysPaint3 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            if (map.size()>2){
                System.out.println("No");
                continue;
            }
            if(map.size()==1){
                System.out.println("Yes");
                continue;
            }
            int[] freq = new int[2];
            int idx = 0;
            for(int cnt : map.values()){
                freq[idx++] = cnt;
            }
            if(map.size()==2){
                if(n%2==0){
                    if(freq[0] == freq[1]){
                        System.out.println("Yes");
                    } else{
                        System.out.println("No");
                    }
                } else{
                    if(Math.abs(freq[0] - freq[1]) == 1){
                        System.out.println("Yes");
                    } else System.out.println("No");
                }
            }
 
        }
    }
}