package factory;

public class Main {
    
    public static void main(String[] args) {
        Application myApp = new MyApplication();
        Document doc0 = myApp.createDocument();
        doc0.open();
        doc0.save();
        doc0.close();
    }
}
