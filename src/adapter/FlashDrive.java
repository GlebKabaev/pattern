package adapter;

public class FlashDrive implements Usb {

    @Override
    public String getInfo() {
        return "Flash drive info";
    }
}
