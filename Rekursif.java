public class Rekursif {
    public static int findMax(int[] arr, int n, int max) {
        if (n==0){
            return max;
        }
        if (n>0){
            if(arr[n]>max){
                return findMax(arr, n-1, arr[n]);
            } else {
                return findMax(arr, n-1, max);
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int arr[] = { 4, 1, 7, 4, 9, 0, 5, 8, 4, 13, 12, 15, 10 };
        int result=findMax(arr, arr.length - 1,0);
        System.out.println("Nilai tertinggi adalah"+result);
    }
}