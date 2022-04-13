package factory;

import java.util.List;

abstract class Application {
     protected List<Document> docs;

      /**
      * Factory Method
      */
       abstract Document createDocument();

       void newDocumento() {
           Document doc = this.createDocument();
           docs.add(doc);
           this.openDocument(doc);
       }

       void openDocument(Document doc) {
           doc.open();
       }
}
