public final class TrigonometricFunc {
	
	//
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
		for(int n=2; n<=5; n++) {
			result_value += negative_one * ( factorial(2*n-1, x) / factorial(2*n-1) );
		}
	}
	public static double cos(double x) {
		int 	negative_one    = -1;
		double 	result_value 	= 0.0d;
		
	}
	public static double tan(double x) {
		int 	negative_one    = -1;
		double 	result_value 	= 0.0d;
		
	}
}
