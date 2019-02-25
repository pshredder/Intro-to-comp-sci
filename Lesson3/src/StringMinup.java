
public class StringMinup {

	public static void main(String[] args) {
	
	String x = "Clefmael Zephyr";
	int r = x.length();
	System.out.println(r - 1);
	
	System.out.println(x);
	System.out.println(x.substring(9) + x);
	String L = x.substring(9);
	System.out.println(L);
	String F = x.substring(0,8);
	System.out.println(F);
	System.out.println(F + " " +L);
	
	
	}

}
