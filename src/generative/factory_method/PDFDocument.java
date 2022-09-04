package generative.factory_method;

public class PDFDocument extends Document {

    @Override
    public void open() {
        System.out.println("Opened pdf file.");
    }

    @Override
    public void close() {
        System.out.println("Closed pdf file.");
    }

    @Override
    public void save() {
        System.out.println("Saved pdf file.");
    }

}
