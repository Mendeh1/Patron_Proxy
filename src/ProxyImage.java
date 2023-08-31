public class ProxyImage implements Image {
    private RealImage realImage;
    private String nombreImage;

    public ProxyImage(String nombreImage) {
        this.nombreImage = nombreImage;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(nombreImage);
        }
        realImage.display();
    }
}

