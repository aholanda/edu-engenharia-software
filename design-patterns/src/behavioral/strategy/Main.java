package behavioral.strategy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Sort s = null;
        Comparable[] arr = null;
        int n;
        
        System.out.print("Choose sort algorithm - 0 for Insertion, 1 for Selection, 2 for Shell: ");        
        n = reader.nextInt();                               
        
        switch(n) {
            case 0:
                s = new Insertion();
                break;
            case 1:
                s = new Selection();
                break;
            case 2:
                s = new Shell();
                break;
                            
            default:
                System.err.println("Wrong option:" + n);
                System.exit(-1);
                break;            
        }
        
        System.out.print("Enter with the number of integer elements to be sorted: ");
        n = reader.nextInt();

        
        arr = new Integer[n];
        System.out.println("Enter with the integers, one per line:");
        for (int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
        }
        
        if (s != null) {
            s.sort(arr);
            s.show(arr);
        }
    }
}
