package factory;

abstract class Document {
    void open() {
          System.out.println("Document.open()");
      }

      void close() {
          System.out.println("Document.close()");
      }

      void save() {
          System.out.println("Document.save()");
      }
}
