public class ExerciseT1A1 extends Thread 
{
    private int threadNum; // Instance variable to hold the thread number
    private static char[] list = {'A', 'B', 'C', 'D', 'E'}; // Character array

    // Constructor to set the thread number
    public ExerciseT1A1(int number) 
    {
        this.threadNum = number;
    }

    // The method that runs when the thread starts
    @Override
    public void run() 
    {
        // Loop through the list and print messages with a delay
        for (char c : list) 
        {
            System.out.println("I am thread #" + threadNum + " " + c);
            try 
            {
                // Delay of 2000 milliseconds (2 seconds)
                Thread.sleep(2000);
            } 
            catch (InterruptedException e) 
            {
                // Handle interruption
                System.out.println("Thread #" + threadNum + " was interrupted.");
            }
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) 
    {
        // Creating and starting multiple threads
        for (int i = 0; i < 3; i++)    // Example: creating 3 threads
        { 
            ExerciseT1A1 thread = new ExerciseT1A1(i + 1); // Thread numbers start from 1
            thread.start();  // Start the thread
        }
    }
}