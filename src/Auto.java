import java.util.concurrent.ThreadLocalRandom;

public class Auto extends Thread {
    Auto auto;

    public Auto(String name, Auto auto) {
        super(name);
        this.auto = auto;
    }

    public Auto(String name) {
        super(name);
    }



    public void run(){
        if (auto != null){
            try {
                sleep(1000);
                auto.start();
            } catch (NullPointerException | InterruptedException e) {
                e.printStackTrace();
            }
            if (this.getName().equals("Auto5")) {
                System.out.println("\n" + this.getName() + " Gets the Stick \uD83D\uDD25");
                System.out.println(this.getName() + " Drives to finish \uD83C\uDFC1");
                System.out.println(this.getName() + " Drives to  " + auto.getName());
            } else {
                System.out.println("\n" + this.getName() + " Gets the Stick \uD83D\uDD25");
                System.out.println(this.getName() + " Drives to  " + auto.getName());
            }

            if(auto.getName().equals("Auto1")){
                System.out.println("\n" + auto.getName() + " Gets the stick \uD83D\uDD25");
                System.out.println(auto.getName() + " Drives to finish \uD83C\uDFC1");
            }
        }
    }
}










        // IN THIS CASE YOU HAVE ONE THREAD RUNNING ONLY AND YOU HAVE STARTED ONLY 1 THREAD WHICH IS AUTO1

       /* Runner runner2 = new Runner();
        runner2.setName("Runner2");

        Runner runner3 = new Runner();
        runner3.setName("Runner3");

        Runner runner4 = new Runner();
        runner4.setName("Runner4");

        Runner runner5 = new Runner();
        runner5.setName("Runner5");

        Thread.currentThread().setName("Runner1");

        Thread[] mRunners = {Thread.currentThread(), runner2, runner3, runner4, runner5};

        System.out.println("\nIt has started");

        System.out.println("------------------------");

        int j;


        for (j = 0; j < mRunners.length; j++) {
            System.out.println(mRunners[j].getName() + " Gets the stick \uD83D\uDD25");
            try {

                System.out.println(mRunners[j].getName() + " Walks to " + mRunners[j + 1].getName());
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getMessage();
            }
            if (j == 4) {
                System.out.println(mRunners[j].getName() + " Walks to Finish \uD83C\uDFC1");
            }

        }

        System.out.println("-----------------------");

        // Here i have reversed an Array (mRunners)
        Thread temp;
        for (int i = 0; i < mRunners.length / 2; i++) {
            temp = mRunners[i];
            mRunners[i] = mRunners[mRunners.length - i - 1];
            mRunners[mRunners.length - i - 1] = temp;
        }

        for (j = 0; j < mRunners.length; j++) {
            System.out.println(mRunners[j].getName() + " Gets the stick \uD83D\uDD25");
            try {
                System.out.println(mRunners[j].getName() + " Walks to " + mRunners[j + 1].getName());
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getMessage();
            }
            if (j == 4) {
                System.out.println(mRunners[j].getName() + " Walks to Finish \uD83C\uDFC1" );
            }
        }

        */



