
public class calculator {
	String name;
	int balance;
	public calculator() {
		 name = "abc";
		 balance = 12345;
	}
	public calculator(String n , int num) {
		 name = n;
		 balance = num;
	}
	public void display() {
		System.out.println(name);
		System.out.println(balance);
	}

}
