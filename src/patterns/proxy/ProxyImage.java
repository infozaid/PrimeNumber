package patterns.proxy;

public class ProxyImage implements Image {

    String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName, RealImage realImage) {
        this.fileName = fileName;
        this.realImage = realImage;
    }


    @Override
    public void display() {
        if (realImage==null){
            realImage=new RealImage(fileName);
        }
    }
}
