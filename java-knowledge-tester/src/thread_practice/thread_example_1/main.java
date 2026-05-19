package thread_practice.thread_example_1;

public class main {
    static void main() {
        ThreadClassExample1 t1 = new ThreadClassExample1();
        ThreadClassExample2 t2 = new ThreadClassExample2();

        t1.start();
        t2.start();
    }
}
