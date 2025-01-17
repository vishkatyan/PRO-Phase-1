import java.util.HashMap;

public class Session3 {
    public static int bruteForce(int arr[], int k){
        int count=0;
        for(int i=0; i<arr.length; i++){
            int first = arr[i];
             for(int j=i+1; j<arr.length; j++){
                 int second = arr[j];
                 if(first+second==k)
                     count++;
             }
        }
        return count;
    }
    public static int optimizedApproach(int arr[], int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int compEle = k-arr[i];
            if(map.containsKey(compEle))
                count++;
            map.put(arr[i], 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3, 3, 1, 2, 5, 4};
        System.out.println(bruteForce(arr, 6));
        System.out.println(optimizedApproach(arr, 6));
    }
}
