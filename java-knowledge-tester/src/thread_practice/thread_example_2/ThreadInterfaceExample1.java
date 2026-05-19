package thread_practice.thread_example_2;

public class ThreadInterfaceExample1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println("ThreadInterfaceExample1::I am dancing..");
        }
    }
}
