//�����������ά����ķ���printArray()�������ͽ�����ά�����к��еķ�����trans()����
public class ArrayRowColumnSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int y[][] = new int[x.length][x.length];
//		for(int i=0;i<x.length;i++){
//			for(int j=0;j<x[i].length;j++){
//				System.out.print(x[i][j]+"\t");
//			}
//			System.out.println();
//		}
		printArray(x);
		System.out.println("���л����С���");
		trans(x,y);
//		for(int i=0;i<x.length;i++){
//			for(int j=0;j<x[i].length;j++){
//				y[i][j] = x[j][i];
//			}
//		}
		System.out.println("���н�����ϣ�");
		printArray(y);
//		for(int i=0;i<y.length;i++){
//			for(int j=0;j<y[i].length;j++){
//				System.out.print(y[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}
	public static void printArray(int[][] z){//��ά��������������������
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void trans(int[][] q,int[][] w){//q�ǵ�һ����ά���飬w�ǵڶ�����ά����
		for(int i=0;i<q.length;i++){
			for(int j=0;j<q[i].length;j++){
				w[i][j] = q[j][i];
			}
		}
	}
}
