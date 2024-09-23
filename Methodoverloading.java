public class Methodoverloading {
    public static void main(String[] args) {
        Methodoverloading methodoverloading = new Methodoverloading();
        methodoverloading.add(10, 20);
        methodoverloading.add(10, 20, 30);
    }

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition: " + (a + b + c));
    }
}
