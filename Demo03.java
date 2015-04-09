package ClassTestPart2;

/*
 * 字符串的操作：把一个英语句子中的单词的次序颠倒后输出。
 * @author  唐佳刚
 */
public class Demo03 {
	//定义一个英语句子
	String str = "how are you";
	//交换次序的方法
	public void OutOfOrder(){
		//String的拆分
		String[] strs = str.split(" ");
		//for循环
		System.out.println("原语句：");
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i] + " ");
		}
		System.out.println("\n转换后的语句：");
		for (int i = strs.length - 1; i >= 0; i--) {
			System.out.print(strs[i] + " ");
		}
	}

	public static void main(String[] args) {
		new Demo03().OutOfOrder();;
	}

}
