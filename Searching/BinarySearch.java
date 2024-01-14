package Searching;

class BinarySearch {
    int binarySearch(int[] array, int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println(array[mid]);

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] array = {3, 29, 94, 229, 255, 433, 445, 450, 495, 651, 721, 762, 764, 788, 835, 847, 945};
        int n = array.length;
        int x = 847;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}