package test;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 3, 6, 8, 1, 2, 5 };
		new Search().TwoInsertSort(array, array.length);
		for (int i : array) {
			System.out.println(i);
		}

	}

	void TwoInsertSort(int array[], int n) {
		int left, right, num;
		int middle, j, i;
		for (i = 1; i < n; i++) {
			left = 0;// ׼��
			right = i - 1;
			num = array[i];
			while (right >= left)				// ���ַ����Ҳ���λ��
			{
				middle = (left + right) / 2; 	// ��ָ��������õ��м�λ��
				if (num < array[middle])		// ���������Ԫ��Ӧ������������
					right = middle - 1;
				else
					left = middle + 1;      // �����������Ԫ��Ӧ����������
			}
			// ÿ�β�����Ϻ�left�ܱ�right��һ��a[left]���Ǵ�ŵ�һ����num����������Ӧ�Ӵ˴���ʼ��ÿ
			// ��Ԫ������һλ������num����a[left]�У������ͱ�֤��a[0...i]���ź����
			for (j = i - 1; j >= left; j--)
				// ���������������R[i]�ļ�¼
				array[j + 1] = array[j];
			array[left] = num;// ����
		}
	}

}
