// Abstract Product - Button
interface Button {
    void render();
}

// Abstract Product - Checkbox
interface Checkbox {
    void render();
}

// Concrete Product - Windows Button
class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

// Concrete Product - Mac Button
class MacButton implements Button {
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

// Concrete Product - Windows Checkbox
class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}

// Concrete Product - Mac Checkbox
class MacCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factory - Windows Factory
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Concrete Factory - Mac Factory
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Client code
class Client {
    private Button button;
    private Checkbox checkbox;

    // The client interacts with the abstract factory and products
    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}


public class factory1{
    public static void main(String[] args) {
            // Choose the factory based on the platform
        GUIFactory factory = new WindowsFactory();  // Or MacFactory
        Client client = new Client(factory);
        client.renderUI();
    }
}