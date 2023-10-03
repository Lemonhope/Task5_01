
package Task5_01;

public class Main {
    public static void main(String[] args) {
        XMLHandler myXML = new XMLHandler();
        myXML.open();
        myXML.change();
        myXML.save();
        TXTHandler myTXT = new TXTHandler();
        myTXT.open();
        myTXT.change();
        myTXT.save();
        DOCHandler myDOC = new DOCHandler();
        myDOC.open();
        myDOC.change();
        myDOC.save();
    }
}
