
public class soru1 {

	public static void main(String[] args) {
		int[][] matris1 = new int[][]{
            {0,1,0},
            {0,0,1},
            {1,1,1},
            {0,0,0}
		};;
    	int[][] matris2 = new int[matris1.length][matris1[0].length];
		int canlihucre = 0;
		for(int i=0;i<matris1.length;i++) {
			for(int j=0;j<matris1[0].length;j++) {	
				
				if(i>0 && j>0) {
					
					if(i==matris1.length-1 && j<matris1[0].length-1)
						canlihucre=matris1[i-1][j]+matris1[i][j-1]+matris1[i][j+1]+matris1[i-1][j+1]+matris1[i-1][j-1];
					
					else if(i<matris1.length-1 && j==matris1[0].length-1)
						canlihucre=matris1[i+1][j]+matris1[i-1][j]+matris1[i][j-1]+matris1[i+1][j-1]+matris1[i-1][j-1];
					
					else if(i==matris1.length-1 && j==matris1[0].length-1 && j>0 && i>0)
						canlihucre=matris1[i-1][j]+matris1[i][j-1]+matris1[i-1][j-1];
					
					else 
						canlihucre=matris1[i+1][j]+matris1[i-1][j]+matris1[i][j-1]+matris1[i][j+1]+
								   matris1[i-1][j+1]+matris1[i-1][j-1]+matris1[i+1][j-1]+matris1[i+1][j+1];
				}
				
				else if(i==0 && j>0) {
					
					if(j==matris1[0].length-1)
						canlihucre=matris1[i+1][j]+matris1[i][j-1]+matris1[i+1][j-1];
					
					else
						canlihucre=matris1[i+1][j]+matris1[i][j-1]+matris1[i][j+1]+matris1[i+1][j+1]+matris1[i+1][j-1];
				}
				
				else if(i>0 && j==0) {
					
					if(i==matris1.length-1)
						canlihucre=matris1[i-1][j]+matris1[i][j+1]+matris1[i-1][j+1];
					
					else
						canlihucre=matris1[i+1][j]+matris1[i-1][j]+matris1[i][j+1]+matris1[i+1][j+1]+matris1[i-1][j+1];
				}
				else
					canlihucre=matris1[i+1][j]+matris1[i][j+1]+matris1[i+1][j+1];
				
					// Canlý hücre syýsýný bulduk. Þimdi kurallara göre deðiþimleri yapýyoruz.		
				
				if(matris1[i][j]==0) {
					
					if(canlihucre==3)
						matris2[i][j]=1;
				}
				
				else {
					
					if(canlihucre<2)
						matris2[i][j]=0;
					
					else if(canlihucre==2 || canlihucre==3)
						matris2[i][j]=1;
					
					else
						matris2[i][j]=0;
				}
			}
		}
		System.out.println("Input");
		for(int i=0;i<matris1.length;i++) {
			for(int j=0;j<matris1[0].length;j++) {
				
				System.out.print(matris1[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Output");
		for(int i=0;i<matris2.length;i++) {
			for(int j=0;j<matris2[0].length;j++) {
				
				System.out.print(matris2[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
