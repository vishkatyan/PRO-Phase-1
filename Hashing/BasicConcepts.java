package Hashing;
class BasicConcepts{
        // Basic Concepts of Hashing
        public static void basic(int arr[], int q[]){
        for(int i=0; i<q.length; i++){
            int count = 0;
            int query = q[i];
            for(int j = 0; j<arr.length; j++){
                if(arr[j]==query)
                 count++;
            }
            System.out.println(count);
        }
        }


    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 6, 3, 7, 7, 7, 7, 4};
        int q[] = {7, 3, 9};
        basic(arr, q);
    }
}
