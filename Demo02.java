package ClassTestPart2;

/*
 * ��ϰ��ֵ���㣺�ҳ�һ������������������֮�͵����ֵ
 * @author �ƼѸ�
 */

public class Demo02 {
	// ����һ������
	int[] s = { 1, -2, 3, 5, -1 };

	// ����forѭ�����
	public void MaxCount() {
		int max = s[0];// ���ֵ
		int sum;// ���
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
		System.out.println("���ֵΪ��" + max);
		printS(startIndex, endIndex);
	}

	// �����±꿪ʼ����ֵ����ӡ����
	public void printS(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(s[i] + " ");
		}
	}

	public static void main(String[] args) {
		new Demo02().MaxCount();
	}
}
