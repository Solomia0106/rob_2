import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {5, 3, 9, 1, 4};

        // Сортування за зростанням
        QuickSort<Integer> ascSorter = new QuickSort<>(array);
        ascSorter.quickSortArray(0, array.length - 1);
        System.out.println("Сортування за зростанням: " + Arrays.toString(ascSorter.getArray()));

        // Сортування за спаданням
        QuickSort<Integer> descSorter = new QuickSort<>(array);
        descSorter.quickSortArrayDesc(0, array.length - 1);
        System.out.println("Сортування за спаданням: " + Arrays.toString(descSorter.getArray()));
    }
}
