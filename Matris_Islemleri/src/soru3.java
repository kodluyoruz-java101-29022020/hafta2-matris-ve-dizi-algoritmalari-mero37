
public class soru3 {
	
	public static int[][] randomMatris(int row,int column){
		int[][] matris=new int[row][column];
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[0].length;j++) {
				int matriceValue=(int)(Math.random()*10);
				matris[i][j]=matriceValue;
			}
		}
		return matris;
	}
	
	public static int[][] multiMatris(int[][] matris1,int[][] matris2){
		int[][] result=new int[matris1.length][matris2[0].length];
	    for(int i=0;i<matris1.length;i++)
        {
            for(int k=0;k<matris2[0].length;k++)
            {
                for(int j=0;j<matris1[0].length;j++)
                {
                    result[i][k]+=matris1[i][j]*matris2[j][k];
                }
            }
        }
		return result;
	}
	
	public static void outputMatris(int[][] matris) {
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[0].length;j++) {
				System.out.print(matris[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args) {
		int[][] matris1=new int[2][4];
		matris1=randomMatris(matris1.length,matris1[0].length);
		outputMatris(matris1);
		int[][] matris2=new int[4][3];
		matris2=randomMatris(matris2.length,matris2[0].length);
		outputMatris(matris2);
		outputMatris(multiMatris(matris1,matris2));

	}

}
