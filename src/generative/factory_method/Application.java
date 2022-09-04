package generative.factory_method;

import java.util.ArrayList;

public abstract class Application {

    private ArrayList<Document> createdDocuments = new ArrayList<>();

    void createDocument(DocumentType documentType) {

        Document document = getDocument(documentType);
        document.open();
        createdDocuments.add(document);

    };

    abstract Document getDocument(DocumentType documentType);

}
