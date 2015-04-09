package ClassTestPart2;

/*
 * 练习数值计算：找出一个整数数组中子数组之和的最大值
 * @author 唐佳刚
 */

public class Demo02 {
	// 定义一个数组
	int[] s = { 1, -2, 3, 5, -1 };

	// 利用for循环求解
	public void MaxCount() {
		int max = s[0];// 最大值
		int sum;// 求和
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i <= s.length - 1; i++) {
			sum = 0;
			for (int j = i; j <= s.length - 1; j++) {
				sum += s[j];
				if (sum > max) {
					max = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("最大值为：" + max);
		printS(startIndex, endIndex);
	}

	// 根据下标开始结束值，打印数组
	public void printS(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(s[i] + " ");
		}
	}

	public static void main(String[] args) {
		new Demo02().MaxCount();
	}
}
