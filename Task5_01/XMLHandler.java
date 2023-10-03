package Task5_01;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("XMLHandler opens a document");
    }

    @Override
    public void change() {
        System.out.println("XMLHandler changes a document");
    }

    @Override
    public void save() {
        System.out.println("XMLHandler saves a document");
    }
}
