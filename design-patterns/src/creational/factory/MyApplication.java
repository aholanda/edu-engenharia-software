package factory;

public class MyApplication extends Application {
    @Override
    Document createDocument() {
            return new MyDocument();
    }
}
