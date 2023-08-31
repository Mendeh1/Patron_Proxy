public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Las imágenes reales se cargarán y mostrarán solo cuando se llame a display()
        image1.display();
        image2.display();

        // En este punto, las imágenes reales ya están cargadas, por lo que no se cargan nuevamente.
        image1.display();
    }
}







