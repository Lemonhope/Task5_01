package Task5_01;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("TXTHandler opens a document");
    }

    @Override
    public void change() {
        System.out.println("TXTHandler changes a document");
    }

    @Override
    public void save() {
        System.out.println("TXTHandler saves a document");
    }
}
