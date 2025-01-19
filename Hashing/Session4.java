import java.util.HashMap;

public class Session4 {
    public static int bruteForce(int arr[], int k){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]-arr[j]==k)
                    count++;
            }
        }
        return count;
    }
    public static int optimizedApproach(int arr[], int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int element = arr[i]+k;
            if(map.containsKey(element))
                count++;
            map.put(arr[i], i);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 1};
        System.out.println(bruteForce(arr, 3));
        System.out.println(optimizedApproach(arr, 3));
    }
}
