
public class employee_info {
	String name;
	int year;
	int salary;
	String address;
	
	public employee_info(String n, int y, int s, String addr) {
		name = n;
		year = y;
		salary = s;
		address = addr;
	}
	public void display() {
		System.out.println(name + year + salary + address);
	}

}
