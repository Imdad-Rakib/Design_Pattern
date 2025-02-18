// Product interface
interface Document{
    void createDocument();
}

// Concrete Products

class TextDocument implements Document{
    @Override
    public void createDocument(){
        System.out.println("Creating a Text Document");
    }
}

class SpreadsheetDocument implements Document{
    @Override
    public void createDocument(){
        System.out.println("Creating a Spreadsheet Document");
    }
}

class PresentationDocument implements Document{
    @Override
    public void createDocument(){
        System.out.println("Creating a Presentation Document");
    }
}

// Factroy(Creator) Interface

interface DocumentFactory{
    Document createDocument();
}

// Concrete Factories

class TextDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        return new TextDocument();
    }
}

class SpreadSheetDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        return new SpreadsheetDocument();
    }
}

class PresentationDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        return new PresentationDocument();
    }
}

public class factory2 {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new TextDocumentFactory();
        Document document = factory.createDocument();
        document.createDocument();

        factory = new SpreadSheetDocumentFactory();
        document = factory.createDocument();
        document.createDocument();

        factory = new PresentationDocumentFactory();
        document = factory.createDocument();
        document.createDocument();

    }
}
