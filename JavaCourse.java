public class JavaCourse extends Product implements DigitalProduct{

    @Override
    double calcPrice() {
        return 50;
    }

    static void DownloadLink() {
        System.out.println("https://github.com/Nurmukhanov/JavaCours/blob/master/.gitignore");

    }
}
