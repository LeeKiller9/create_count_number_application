public class Main {
    public static void main(String[] args) {
        Count count1 = new Count();
        try {
            while ((count1.getMyThread().isAlive())) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is over");
    }
}