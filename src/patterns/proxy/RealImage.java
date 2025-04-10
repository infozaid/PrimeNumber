package patterns.proxy;

public class RealImage implements Image {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    public void loadImage(){
        System.out.println("load Image: "+ fileName);
    }

    @Override
    public void display() {
        System.out.println("Display Image is: "+fileName);
    }


}
