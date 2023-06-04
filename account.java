
public class account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		account_info  ac = new account_info();
		
		
		/*account_info a[] = new account_info[2]; // error in arr of object
		a[0] = new account_info();
		a[1] = new account_info();
		
		a[0].setname("abc");
		a[1].setname("badal");

		a[0].setbalence(1000);
		a[1].setbalence(2000);
	
		a[0].getname();
		a[1].getname();
		a[0].getbalence();
		a[1].getbalence();
		System.out.println(a[0]);
		System.out.println(a[1]);*/
		
		
		ac.setname("abc");
		ac.setbalence(1500);
		ac.settotal(5000);
		ac.setdeposite(2000);
		System.out.println(ac.getname());
		System.out.println(ac.getbalence());
		System.out.println(ac.getwithdrow());
		System.out.println(ac.getdeposite());
		
		
		/*System.out.println(ac.getname());  // second time call the function
		System.out.println(ac.getbalence());
		System.out.println(ac.getwithdrow());
		System.out.println(ac.getname());  // third time call the function
		System.out.println(ac.getbalence());
		System.out.println(ac.getwithdrow());*/

	}

}
