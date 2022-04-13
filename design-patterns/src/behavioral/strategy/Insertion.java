package behavioral.strategy;

public class Insertion extends Sort {

    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            for(int j = i; j > 0 && less(a[j], a[j-1]); j--)
                swap(a, j, j-1);
        }
    }
    
}
