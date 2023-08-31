public class Main {
    public static void main(String[] args) {
        Image image1 = new RealImage("image1.jpg");
        Image image2 = new RealImage("image2.jpg");

        // Las imágenes reales se cargarán y mostrarán inmediatamente al crearlas
        image1.display();
        image2.display();

        // Las imágenes reales ya están cargadas, por lo que no hay retraso en las llamadas posteriores.
        image1.display();
    }
}
