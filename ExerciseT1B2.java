public class ExerciseT1B2 implements Runnable 
{
    private int threadNum; // Instance variable to hold the thread number

    // Constructor to set the thread number
    public ExerciseT1B2(int number) 
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
                System.out.println("Thread #" + threadNum + " was interrupted.");
            }
        }
    }
}