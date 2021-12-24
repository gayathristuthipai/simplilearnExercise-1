package fullStackJavaCourse;

public class mathRunner {
	
	
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
		
	
	public static int ncr(int n, int r) {
		int combination=factorial(n)/(factorial(n-r)*factorial(r));
		return combination;
		
	}
	
	public static int npr(int n, int r) {
		int permutation=factorial(n)/factorial(n-r);
		return permutation;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(3));
		System.out.println(ncr(3,2));
	    System.out.println(npr(3,2));
	    
		}

}
