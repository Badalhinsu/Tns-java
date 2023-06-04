
public class overriding {
	public static void main(String args[]) {
		rbi n = new rbi();
		System.out.println(n.income());
	}
}
class rbi{
		public int income() {
		return 1000;
		}
}
 class sbi extends rbi{
		public int income1() {
			 return 1500;
		 }
 }


