package day7;

/* 2. Write multi-threaded program that continuously prints the strings “ping” and
“PONG” in the console at random distances at intervals of one second. Use two
threads one for “ping” and another for “PONG”. */

import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random rand = new Random();
        
        // Create a Runnable object for the ping thread
        Runnable ping = () -> {
            // Loop indefinitely
            while (true) {
                try {
                    // Pause for one second
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Print the stack trace if an InterruptedException is thrown
                    e.printStackTrace();
                }
                // Print "ping" to the console
                System.out.println("ping");
            }
        };
        
        // Create a Runnable object for the pong thread
        Runnable pong = () -> {
            // Loop indefinitely
            while (true) {
                try {
                    // Pause for a random amount of time between zero and one second
                    Thread.sleep(rand.nextInt(1000));
                } catch (InterruptedException e) {
                    // Print the stack trace if an InterruptedException is thrown
                    e.printStackTrace();
                }
                // Print "PONG" to the console
                System.out.println("PONG");
            }
        };
        
        // Create two Thread objects, one for each Runnable
        Thread thread1 = new Thread(ping);
        Thread thread2 = new Thread(pong);
        
        // Start both threads
        thread1.start();
        thread2.start();
    }
}

/* OUTPUT -
PONG
ping
PONG
PONG
PONG
ping
PONG
ping
PONG
PONG
ping
PONG
PONG
ping
PONG
PONG
ping
PONG
ping
PONG
PONG
ping
PONG
ping
PONG
PONG
ping
PONG
PONG
ping
PONG
PONG
PONG
ping
PONG
PONG
ping
PONG
ping
PONG
PONG
PONG
PONG
ping
PONG
PONG
PONG
ping
PONG
PONG
PONG
PONG
PONG
ping
PONG
PONG
PONG
PONG
ping
PONG
PONG
ping
PONG
PONG
PONG
ping
PONG
ping
PONG
ping
PONG
PONG
ping
PONG
PONG
PONG
ping
PONG
ping
PONG
*/