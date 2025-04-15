class Animal {
    private boolean isHungry = true;

    public synchronized void feed() {
        while (!isHungry) {
            try {
                wait(); // Wait until the animal is hungry
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Feeding the animal...");
        isHungry = false;
        notifyAll(); // Notify all waiting threads
    }

    public synchronized void makeHungry() {
        while (isHungry) {
            try {
                wait(); // Wait until the animal is fed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The animal is hungry again!");
        isHungry = true;
        notify(); // Notify one waiting thread
    }
}

public class Threadcommunication {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Thread feeder = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                animal.feed();
            }
        });

        Thread caretaker1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                animal.makeHungry();
            }
        });

        Thread caretaker2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                animal.makeHungry();
            }
        });

        feeder.start();
        caretaker1.start();
        caretaker2.start();
    }
}
