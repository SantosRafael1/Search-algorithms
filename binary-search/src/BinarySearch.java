

public class BinarySearch {

    //Binary search funciona em arrays ordenados

    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 8, 10, 23, 456, 90, 100, 340};
        int last = arr.length -1;

        binarySearch(arr, 0, last, 3);
        binarySearch(arr, 0, last, 8);
        binarySearch(arr, 0, last, 10);
        binarySearch(arr, 0, last, 23);

    }

    public static void binarySearch(int[] arr, int first, int last, int target) {

        int mid = (first + last) / 2; //Calcular o meio

        while(first <= last) {
            if(arr[mid] < target) {
                first = mid + 1;
            } else if(arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
    }
}
