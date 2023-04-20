public class Search {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 7;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("key is not found at index:");
        } else {
            System.out.println("key is found " + index);
        }
    }

}
