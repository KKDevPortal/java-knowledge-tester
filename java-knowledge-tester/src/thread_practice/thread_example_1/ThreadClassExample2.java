package thread_practice.thread_example_1;

public class ThreadClassExample2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println("ThreadClassExample2::I am dancing....");
        }
    }
}
