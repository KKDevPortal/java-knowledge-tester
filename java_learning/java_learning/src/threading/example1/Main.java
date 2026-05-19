package threading.example1;

public class Main {
    static void main() {
        Threading_example_1 t1 = new Threading_example_1();
        Threading_example_2 t2 = new Threading_example_2();

        t1.start();
        t2.start();
    }


}
