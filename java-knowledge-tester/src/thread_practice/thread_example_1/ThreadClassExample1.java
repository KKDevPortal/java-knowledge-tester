package thread_practice.thread_example_1;

public class ThreadClassExample1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println("ThreadClassExample1::I am cooking food");
        }
    }
}
