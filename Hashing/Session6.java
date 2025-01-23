public class Session6 {
    public static int bruteForce(int arr[], int l, int r){
        int sum = 0;
        for(int i=l; i<=r; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int optimized(int arr[], int l, int r){
        int n = arr.length;
        int sum = 0;
        // using prefix sum array
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        sum = prefix[r]-prefix[l-1];
        return sum;
    }
    public static void main(String[] args) {
        int q[][] = { { 1, 2 }, { 1, 5 } };
        int arr[] = {3, 4, 1, 2, 1, 4};
        for(int i=0; i<q.length; i++){
            int curr_l = q[i][0];
            int curr_r = q[i][1];
            System.out.println(bruteForce(arr, curr_l, curr_r));
        }
        System.out.println(optimized(arr, 1, 3));

    }
}
