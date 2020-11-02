package static_execution;

class CoDemo {

    public static int Number;

    static {
	Number = 100;
	System.out.println("Static Block Executed");
    }

   // public static void main(String[] args) {
	// TODO Auto-generated method stub
	//System.out.println("Main Method Executed " + Number);
    //}

}

public class Demo {

    public static void main(String[] ARGS) {
	System.out.println("Main Method Executed " + CoDemo.Number);
    }

}