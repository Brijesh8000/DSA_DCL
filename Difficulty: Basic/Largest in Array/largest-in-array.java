class Solution {
    
    static int largest(int[] arr) {
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        System.out.println("Largest element: " + largest(arr));
    }
}