import java.util.HashMap;
import java.util.Map;

public class Session7 {
    public static int bruteForce(int arr[], int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int currentSum = 0;
            for(int j = i; j>=1; j--){
                currentSum+=arr[j];
                if(currentSum==k)
                    count++;
            }

        }
        return count;
    }
    // Better Approach - using prefix sum array
    public static int better(int arr[], int k){
        int n = arr.length;
        int count = 0;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];  //insert the value in prefix array
        }
        for(int j = 0; j<n; j++){
            for(int i=0; i<j; i++){
                if(prefix[i] == prefix[j]-k)
                    count++;
            }
        }
        return count;
    }

    public static int optimized(int arr[], int k){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int  count = 0;
        for(int j=0; j<n; j++){
            if(prefix[j]==k) count++;
            int sum = prefix[j]-k;
            if(map.containsKey(sum))
                count+= map.get(sum);
            map.put(prefix[j], map.getOrDefault(prefix[j], 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 0, 1, 2, 10, 8};
        int arr[] = {9, 4, 0, 20, 3, 10, 5};
//        System.out.println(bruteForce(arr, 33));
//        System.out.println(better(arr, 33));
        System.out.println(optimized(arr, 33));

    }
}
