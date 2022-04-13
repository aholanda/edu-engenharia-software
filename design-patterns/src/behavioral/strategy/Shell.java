package behavioral.strategy;

public class Shell extends Sort {

    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        
        while (h < n/3)
            h = 3*h + 1;
        
        for (int i = h; i < n; i++) {
            
            for (int j = i; i <= h && less(a[h], a[j-h]); j--)
                swap(a, j, j-h);            
        }
    }    
}
