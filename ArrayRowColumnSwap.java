//定义了输出二维数组的方法printArray()方法，和交换二维数组行和列的方法，trans()方法
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
		System.out.println("行列互换中……");
		trans(x,y);
//		for(int i=0;i<x.length;i++){
//			for(int j=0;j<x[i].length;j++){
//				y[i][j] = x[j][i];
//			}
//		}
		System.out.println("行列交换完毕：");
		printArray(y);
//		for(int i=0;i<y.length;i++){
//			for(int j=0;j<y[i].length;j++){
//				System.out.print(y[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}
	public static void printArray(int[][] z){//二维数组输出函数，遍历输出
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void trans(int[][] q,int[][] w){//q是第一个二维数组，w是第二个二维数组
		for(int i=0;i<q.length;i++){
			for(int j=0;j<q[i].length;j++){
				w[i][j] = q[j][i];
			}
		}
	}
}
