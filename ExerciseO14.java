public class ExerciseO14 
{
    public static void main(String[] args)
    {
        /*--- 1 ------ write the sequence of statements to call the method outerMethod ------------*/     
OuterClass outer = new OuterClass();
        outer.outerMethod();
        /*--- 2 ------ write the sequence of statements to call the method innerMethod2 ------------*/
OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.innerMethod2();
    }
}

class OuterClass
{
    public void outerMethod()
    {
        System.out.println("outer class");
        /*---- 3 ----- write the sequence of statements to call the method innerMethod1 ------------*/
NestedClass nested = new NestedClass();
        nested.innerMethod1();
    }

    static class NestedClass 
    { 
        public void innerMethod1()
        {
            System.out.println("nested class Method1");
        }

        public void innerMethod2()
        {
            System.out.println("nested class Method2");
            /*---- 4 ----- write the sequence of statements to call the method outerMethod ------------*/
OuterClass outer = new OuterClass();
            outer.outerMethod();
        }
    }  // end of class NestedClass
} // end of class OuterClass