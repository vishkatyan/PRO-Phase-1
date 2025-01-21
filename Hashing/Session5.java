import java.util.HashMap;

public class Session5 {
    public static int bruteForce(int arr[], int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(Math.abs(arr[i] - arr[j])==k)
                    count++;
            }
        }
        return count;
    }
    public static int optimized(int arr[], int k){
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j =0; j<arr.length; j++){
            if (map.containsKey(arr[j]+k))
                count+=map.get(arr[j]+k);
            if(map.containsKey(arr[j]-k))
                count+=map.get(arr[j]-k);
            map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1, 5, 3, 4, 2, 4};
        System.out.println(bruteForce(arr, 2));
        System.out.println(optimized(arr, 2));

    }
}
