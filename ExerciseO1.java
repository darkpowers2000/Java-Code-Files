class Demo {
    private int val1; // the first data member
    private int val2; // the second data member

    public void setValues(int num1, int num2) {
        val1 = num1;
        val2 = num2;
    }

    public int getValue1() {
        return val1;
    }

    public int getValue2() {
        return val2;
    }

    public int getAverage() {
        return (val1 + val2) / 2;
    }
}

public class ExerciseO1 {
    public static Demo addDemo(Demo d1, Demo d2) {
        Demo result = new Demo();
        result.setValues(d1.getValue1() + d2.getValue1(), d1.getValue2() + d2.getValue2());
        return result;
    }

    public static void incrDemo2(Demo d) {
        d.setValues(d.getValue1() + 5, d.getValue2() + 5);
    }

    public static void main(String[] args) {
        Demo item = new Demo();
        item.setValues(10, 20); // Example values, replace with user input if needed
        System.out.println("Average of item: " + item.getAverage());

        Demo obj1 = new Demo();
        obj1.setValues(5, 7);

        Demo obj2 = new Demo();
        obj2.setValues(14, 9);

        Demo objR = addDemo(obj1, obj2);
        incrDemo2(obj1);

        System.out.println("Values of objR: " + objR.getValue1() + ", " + objR.getValue2());
        System.out.println("Values of obj1 after increment: " + obj1.getValue1() + ", " + obj1.getValue2());
    }
}