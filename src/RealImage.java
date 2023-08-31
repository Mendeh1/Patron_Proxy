public class RealImage implements Image {
    private String nombreImage;

    public RealImage(String nombreImage) {
        this.nombreImage = nombreImage;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + nombreImage);
    }

    public void display() {
        System.out.println("Displaying image: " + nombreImage);
    }
}