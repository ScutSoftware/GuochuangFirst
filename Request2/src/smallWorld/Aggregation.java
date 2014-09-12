package smallWorld;

public class Aggregation {
	
	public static double calculate(int[][] n) {
		double total = 0;
		double value = 0;
		
		//计算每个词汇的邻接点集合
		int[] sum = new int [n.length];
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[0].length; j++ ) {
				if(n[i][j] == 1) {
					sum[i] += 1;
				}
			}
		}
		
		//计算聚集度
		for(int i = 0; i < sum.length; i++) {
			for(int m = 0 ; m<=i; m++) {
				for(int o = 0; o < m; o++) {
					value += n[o][m];
				}
			}
			
			total += sum[i]*value;
			total /= sum[i];
		}
		
		total = total / sum.length;
		
		System.out.println(total);
		return total;
	}
	
	

}
