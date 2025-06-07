package adapter;

public class Computer {
    private Usb usb;

    public void setUsb(Usb usb) {
        this.usb = usb;
    }

    public void read() {
        if (usb != null) {
            System.out.println(usb.getInfo());
        } else {
            System.out.println("usb разъем пуст");
        }
    }
}

