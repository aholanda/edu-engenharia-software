package singleton;

public class Singleton {
    
    // make an unique instace private
    private static Singleton instance = new Singleton();
    
    // The class can not be instantiated
    private Singleton() {}
    
    // The object is available only via method
    public static Singleton getInstance(){
      return instance;
   }
}
