package ant.example;

public class AntTest {

	 public int multi(int number1, int number2) {
	        return number1 * number2;
	    }
	 
	 public static void main(String[] args) {
		 AntTest math = new AntTest();
	        System.out.println("Result is: " + math.multi(5, 10));
	    }
	
}
