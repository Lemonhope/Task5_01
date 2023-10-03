package Task5_01;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("DOCHandler opens a document");
    }

    @Override
    public void change() {
        System.out.println("DOCHandler changes a document");
    }

    @Override
    public void save() {
        System.out.println("DOCHandler saves a document");
    }
}
