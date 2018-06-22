public class BinarySearch {

    public boolean isFound(int[] numbers, int n) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (numbers[middle] == n) return true;
            else if (numbers[middle] > n) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return false;
    }
}
