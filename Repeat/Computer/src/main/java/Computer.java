public class Computer {
    final String vendor;
    final String name;
    Processor processor;
    RAM RAM;
    Driver driver;
    Screen screen;
    Keyboard keyboard;

    public Computer(String vendor, String name, Processor processor, RAM RAM, Driver driver, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.RAM = RAM;
        this.driver = driver;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRAM(RAM RAM) {
        this.RAM = RAM;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
