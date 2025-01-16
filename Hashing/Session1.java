import java.util.HashMap;
public class Session1 {
  // Find & Print no. with max and min frequency
    public static void bruteForce(int arr[]){
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i; j<arr.length; j++){
                if(arr[i]==arr[j])
                    count++;
            }
         if(maxCount<count) maxCount= count;
         if(minCount>count) minCount= count;
        }
        System.out.println("MaxCount : " + maxCount);
        System.out.println("MinCount : " + minCount);
    }

    public static void optimised(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
            if(max<map.get(arr[i]))
                max = map.get(arr[i]);
            if(min>map.get(arr[i]))
                min = map.get(arr[i]);
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 3, 5, 5};
        bruteForce(arr);
        optimised(arr);
    }
}
