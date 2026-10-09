package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException{
        //19.1
        Loader loader = new Loader();
        Thread thread = new Thread(loader);
        System.out.println("Запуск потока");
        thread.start();
        Thread.sleep(2000);
        System.out.println("stop()");
        loader.stop();
        thread.join();
        System.out.println("Поток завершён");
        //19.2
        Printer printer = new Printer();
        Thread thread1 = new Thread(() -> printer.printDocument("Иван"));
        Thread thread2 = new Thread(() -> printer.printDocument("Мария"));
        Thread thread3 = new Thread(() -> printer.printDocument("Олег"));
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Все документы напечатаны");
        }

    }

