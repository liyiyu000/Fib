
public class Solution {
	
	public static void main (String [] args) {
		System.out.println(fib(1));
		System.out.println(fib(5));
		System.out.println(fib(10));
	}
	
	private static int fib (int n) {
		if (n == 0 || n == 1) return n;
		int [] dp = new int [n + 1];
		dp[0] = 0;
		dp[1] = 1;
		return helper (dp, 2);
	}
	
	private static int helper (int [] dp, int count) {
		dp[count] = dp[count - 1] + dp[count - 2];
		if (count == dp.length - 1) return dp[count];
		else return helper (dp, count + 1);
	}
}
