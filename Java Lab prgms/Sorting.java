class SortingNamesInArray {
    public static void main(String[] args) {
        String[] names = {"Alice", "Charlie", "Bob", "Eve"};

        sortNames(names);

        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void sortNames(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
