public class ExerciseT1A2 extends Thread 
{
    private int threadNum; // Instance variable to hold the thread number

    // Constructor to set the thread number
    public ExerciseT1A2(int number) 
    {
        this.threadNum = number;
    }

    // The method that runs when the thread starts
    @Override
    public void run() 
    {
        // Array of values to output
        int[] values = {10, 20, 30, 40, 50};
        
        // Loop through the values and print messages with a delay
        for (int value : values) 
        {
            System.out.println("I am thread #" + threadNum + ": " + value);
            try 
           {
                // Delay of 3000 milliseconds (3 seconds)
                Thread.sleep(3000);
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
        for (int i = 0; i < 3; i++)  // Example: creating 3 threads
        { 
            ExerciseT1A2 thread = new ExerciseT1A2(i + 1); // Thread numbers start from 1
            thread.start(); // Start the thread
        }
    }
}