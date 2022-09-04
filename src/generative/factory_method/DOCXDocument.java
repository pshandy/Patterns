package generative.factory_method;

public class DOCXDocument extends Document {

    @Override
    public void open() {
        System.out.println("Opened docx file.");
    }

    @Override
    public void close() {
        System.out.println("Closed docx file.");
    }

    @Override
    public void save() {
        System.out.println("Saved docx file.");
    }

}
