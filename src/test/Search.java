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
			left = 0;// 准备
			right = i - 1;
			num = array[i];
			while (right >= left)				// 二分法查找插入位置
			{
				middle = (left + right) / 2; 	// 　指向已排序好的中间位置
				if (num < array[middle])		// 即将插入的元素应当在在左区间
					right = middle - 1;
				else
					left = middle + 1;      // 　即将插入的元素应当在右区间
			}
			// 每次查找完毕后，left总比right大一，a[left]总是存放第一个比num大的数，因此应从此处开始，每
			// 个元素右移一位，并将num存入a[left]中，这样就保证了a[0...i]是排好序的
			for (j = i - 1; j >= left; j--)
				// 　后移排序码大于R[i]的记录
				array[j + 1] = array[j];
			array[left] = num;// 插入
		}
	}

}
