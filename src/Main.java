
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");
        ThreadGroup mainGroup = new ThreadGroup("main group");


        final Thread thread1 = new Thread(mainGroup, new MyThread());
        thread1.setName("Поток 1");

        final Thread thread2 = new Thread(mainGroup, new MyThread());
        thread2.setName("Поток 2");

        final Thread thread3 = new Thread(mainGroup, new MyThread());
        thread3.setName("Поток 3");

        final Thread thread4 = new Thread(mainGroup, new MyThread());
        thread4.setName("Поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



        Thread.sleep(15000);
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();


    }
}