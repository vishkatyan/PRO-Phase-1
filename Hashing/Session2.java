import java.util.HashMap;

public class Session2 {
    public static boolean bruteForce(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j< arr.length && j<=i+k; j++){
                if(arr[i]==arr[j])
                    return true;
            }
        }
        return false;

    }
    public static boolean optimisedApproach(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]) && i-map.get(arr[i])<=k){
                return true;
            }
            else{
                map.put(arr[i], i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 2, 5, 6 ,9};
        System.out.println(bruteForce(arr, 1));
        System.out.println(optimisedApproach(arr, 2));
    }
}
