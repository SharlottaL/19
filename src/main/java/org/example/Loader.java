package org.example;

public class Loader implements Runnable{
   volatile boolean running = true;

    @Override
    public void run() {
        while(running)
        {
            System.out.println("Загружаю...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
              this.running = false;
                break;
            }
        }
        System.out.println("Загружено...");
    }

    public void stop()
  {
      this.running = false;
  }
}
