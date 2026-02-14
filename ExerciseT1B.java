public class ExerciseT1B 
{
    public static void main(String[] args) 
    {
        // Create an instance of ExerciseT1B1 with thread number 1
        ExerciseT1B1 runnable1 = new ExerciseT1B1(1);
        Thread thread1 = new Thread(runnable1); // Create a new thread for the ExerciseT1B1 instance

        // Create an instance of ExerciseT1B2 with thread number 2
        ExerciseT1B2 runnable2 = new ExerciseT1B2(2);
        Thread thread2 = new Thread(runnable2); // Create a new thread for the ExerciseT1B2 instance

        // Start both threads
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}