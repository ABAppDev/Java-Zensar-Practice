package final_class_access;

final class FinalClass{
    
    private int Number;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
    
}


public class DemoFinal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	FinalClass F = new FinalClass();
	
	F.setNumber(5);
	
	System.out.println(F.getNumber());
	
    }

}
