public final class Math {
	
	/* max方法：用于返回两个同类型数据的较大值 */
	public static byte max(byte x, byte y) {
		return x>=y ? x : y;
	}
	public static short max(short x, short y) {
		return x>=y ? x : y;
	}
	public static int max(int x, int y) {
		return x>=y ? x : y;
	}
	public static long max(long x, long y) {
		return x>=y ? x : y;
	}
	public static double max(double x, double y) {
		return x-y>=0.01d ? x : y;
	}
	
	/* min方法：用于返回两个同类型数据的较小值 */
	public static byte min(byte x, byte y) {
		return x<=y ? x : y;
	}
	public static short min(short x, short y) {
		return x<=y ? x : y;
	}
	public static int min(int x, int y) {
		return x<=y ? x : y;
	}
	public static long min(long x, long y) {
		return x<=y ? x : y;
	}
	public static double min(double x, double y) {
		return x-y<=0.01d ? x : y;
	}
	
	// 两个递归函数为三角函数计算相关的数据  
	private static int factorial(int x) {
		int result_value = 0;
		if(x==1)  return 1;
		else { 
			result_value = x * factorial(--x);
			return result_value;
		}
	}
	private static double factorial(int x, double y) {
		double result_value = 0.0d;
		if(x==1)  return y;	
		else { 
			result_value = y * factorial(--x, y);
			return result_value;
		}
	}
	
	// 三角函数方法的实现 
 	// 注意：调用三角函数时提供的实参必须是弧度值 
 	public static double sin(double x) { 
 		int	negative_one    = -1; 
 		double	result_value 	= x; 
 		for(int n=2; n<=5; n++)  
 			result_value += negative_one * ( factorial(2*n-1, x) / factorial(2*n-1) ); 
 		return result_value; 
 	} 
 	public static double cos(double x) { 
 		final int NEGATIVE_ONE  = -1; 
 		double 	  result_value 	=  1; 
 		for(int n=1; n<=5; n++)  
 			result_value += NEGATIVE_ONE * ( factorial(2*n, x) / factorial(2*n) ); 
 		return result_value; 
 	} 
 	public static double tan(double x) { 
 		final int NEGATIVE_ONE  = -1; 
 		double	  result_value 	= 0.0d; 
 		 
 	} 

}
