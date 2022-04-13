package behavioral.strategy;

/*
    The algorithms were based on book "Algorithms" 4th ed. by Sedgewick 
    and Wayne.

*/

public abstract class Sort {
    
    /**
     * 
     * @return true if u is lesser than v.
     */
    protected boolean less(Comparable u, Comparable v) {
        return u.compareTo(v) < 0;
    }
    
    protected abstract void sort(Comparable a[]);
    
    protected void show(Comparable a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();               
    }
    
    /**
     * 
     * @param a array being sorted
     * @param i put the element in j
     * @param j put the element in i
     */
    protected void swap(Comparable a[], int i, int j) {
        Comparable t = a[i]; 
        a[i] = a[j]; 
        a[j] = t;        
    }
}
