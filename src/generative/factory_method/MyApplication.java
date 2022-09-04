package generative.factory_method;

public class MyApplication extends Application {

    @Override
    Document getDocument(DocumentType documentType) {

        switch (documentType) {
            case PDF:
                return new PDFDocument();
            case DOCX:
                return new DOCXDocument();
        }

        return (null);

    }

}

class Client {

    public static void main(String[] args) {

        Application myApplication = new MyApplication();
        myApplication.createDocument(DocumentType.DOCX);
        myApplication.createDocument(DocumentType.PDF);

    }

}
