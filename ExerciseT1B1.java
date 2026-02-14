public class ExerciseT1B1 implements Runnable 
{
    private int threadNum; // Instance variable to hold the thread number
    private static char[] list = {'A', 'B', 'C', 'D', 'E'}; // Character array

    // Constructor to set the thread number
    public ExerciseT1B1(int number) 
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
                System.out.println("Thread #" + threadNum + " was interrupted.");
            }
        }
    }
}