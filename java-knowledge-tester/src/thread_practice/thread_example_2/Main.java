package thread_practice.thread_example_2;

public class Main {
    public static void main() {
        Thread t1 = new Thread(new ThreadInterfaceExample1());
        Thread t2 = new Thread(new ThreadInterfaceExample2());

        t1.start();
        t2.start();
    }
}
