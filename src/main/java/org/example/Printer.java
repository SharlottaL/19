package org.example;

public class Printer {
    public synchronized void printDocument(String owner)
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(owner + " строка " + i);
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                System.err.println("Печать была прервана: " + e.getMessage());
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("Печать произведена успешно");
    }
}
