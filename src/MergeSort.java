public class MergeSort {
    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }
    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int mid = (from + to) / 2;
            mergeSortHelper(elements, from, mid, temp);
            mergeSortHelper(elements, mid + 1, to, temp);
            merge(elements, from, mid, to, temp);
        }
    }
    public static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        
    }
}
