package ClassTestPart2;

/*
 * �ַ����Ĳ�������һ��Ӣ������еĵ��ʵĴ���ߵ��������
 * @author  �ƼѸ�
 */
public class Demo03 {
	//����һ��Ӣ�����
	String str = "how are you";
	//��������ķ���
	public void OutOfOrder(){
		//String�Ĳ��
		String[] strs = str.split(" ");
		//forѭ��
		System.out.println("ԭ��䣺");
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i] + " ");
		}
		System.out.println("\nת�������䣺");
		for (int i = strs.length - 1; i >= 0; i--) {
			System.out.print(strs[i] + " ");
		}
	}

	public static void main(String[] args) {
		new Demo03().OutOfOrder();;
	}

}
