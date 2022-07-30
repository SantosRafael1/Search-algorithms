public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 23, 90, 200, 140, 450, 321, 5, 43902};
        int arrayLength = arr.length;

        System.out.println(linearSearch(arr, 43902, arrayLength)); //return 8. (target position)
        System.out.println(linearSearch(arr, 3, arrayLength)); //return -1
    }

    public static int linearSearch(int[] arr, int target, int arrayLength) {
        for(int i = 0; i < arrayLength; i++){
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
