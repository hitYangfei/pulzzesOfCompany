package gx.minHamiltonian;

public class circluePrint {
	public static void main(String[] argvs){
		int value=1;
		int n=7;
		int[][] a = new int[n][n];
		for(int i=0;i<n/2+n%2;i++){
			for(int j=i;j<n-i;j++)
				a[j][i]=value++;
			for(int j=i+1;j<n-i;j++)
				a[n-i-1][j]=value++;
			for(int j=n-i-2;j>=i;j--)
				a[j][n-i-1]=value++;
			for(int j=n-i-2;j>i;j--){
				a[i][j]=value++;
			}
		}
		printArray(a);
	}
	public static void printArray(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
