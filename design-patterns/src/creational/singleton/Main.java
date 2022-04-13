package singleton;

public class Main {
    
    public static void main(String args[]) {
          Singleton s0 = Singleton.getInstance();
          Singleton s1 = Singleton.getInstance();
          
          boolean cmp = s0 == s1;
          System.out.println("Refs s0 == s1? " + cmp);        
    }
}
