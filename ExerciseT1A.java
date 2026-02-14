public class ExerciseT1A 
{
    public static void main(String[] args) 
    {
        // Create and start the first thread (ExerciseT1A1)
        ExerciseT1A1 thread1 = new ExerciseT1A1(1);
        thread1.start(); // Start the first thread

        // Create and start the second thread (ExerciseT1A2)
        ExerciseT1A2 thread2 = new ExerciseT1A2(2);
        thread2.start(); // Start the second thread
    }
}