class GenericBubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static <T> void display(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArr = {5, 2, 9, 1, 6};
        System.out.println("Before Sorting:");
        display(intArr);
        bubbleSort(intArr);
        System.out.println("After Sorting:");
        display(intArr);
    }
}
