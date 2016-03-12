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
}
