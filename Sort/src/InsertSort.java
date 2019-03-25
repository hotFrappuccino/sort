
public class InsertSort {
	/*
	 * insert sort(삽입정렬) 2번째부터 끝까지 삽입하면서 정렬 이미 정렬된 상태에서 데이터가 추가될 때 사용
	 */

	public static void main(String[] args) {

		int[] ar = { 7, 4, 5, 2, 9 };
		//두번째부터 끝까지
		for (int i=1; i<ar.length; i=i+1) {
			//두번째 데이터부터 복사
			int st = ar[i];
			int aux = i-1;
			while(aux>=0 && st<ar[aux]) {
				ar[aux+1] = ar[aux];
				aux = aux -1;
			}
			ar[aux+1] = st;
		}
		
		for(int temp : ar) {
			System.out.printf("%d\t", temp);
		}
/*		
		int[] re = new int[ar.length];
		int le = ar.length;

		for (int i = 0; i < le; i = i + 1) {
			
			System.out.printf("i= %d\n", i);
			int j;
			for (j=i; j == 0; j = j - 1) {
				if (ar[i] < re[j]) {
					re[j+1] = re[j];
					re[j] = ar[i];
				} else {
					re[j]=ar[i];
				}
				System.out.printf("j= %d\n", j);
				
			}

		}
	*/
	}

}
