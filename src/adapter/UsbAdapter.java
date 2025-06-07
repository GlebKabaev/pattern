package adapter;

public class UsbAdapter implements Usb {
    MemoryCard memoryCard;
    UsbAdapter(MemoryCard memoryCard){
        this.memoryCard=memoryCard;
    }
    @Override
    public String getInfo() {
        return memoryCard.getCardInfo();
    }


}
