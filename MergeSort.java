public class MergeSort {
    public static void main(String[] args) {
        
    }

    private static int[] aux;

    public static void mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi)
        return;
        int mid = (lo + hi) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(int[] a, int lo, int mid, int hi)
    {
    // Merge a[lo, mid) with a[mid, hi) into aux[0, hi-lo).
        int i = lo, j = mid, N = hi - lo;
        for (int k = 0; k < N; k++)
        {
            if (i == mid) aux[k] = a[j++]; //meaning have merged a[lo, mid), just
            //merge another element from a[mid, hi)
            else if (j == hi) aux[k] = a[i++]; //meaning have merged a[mid, hi), just
            //merge another element from a[lo, mid)
            //the following two lines merge the smaller one
            else if (a[j] == a[i]) aux[k] = a[j++];
            else aux[k] = a[i++];
        }
        // Copy back into a[lo, hi)
        for (int k = 0; k < N; k++)
            a[lo + k] = aux[k];
    }
}