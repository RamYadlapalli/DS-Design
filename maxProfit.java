public class maxProfit {

	public static void main(String[] args) {
		int[] arr = {100, 180, 260, 310, 40, 535, 695} ;
		//int[] arr1 = {210,190,80,70,60};
		System.out.println(maxProfitStocks(arr));		

	}
	
	public static int maxProfitStocks(int[] a){
		
		int len = a.length -1, profit = 0, buyingPrice = a[0] ;
		
		for(int i= 1; i<len; i++){			
			if(a[i]< buyingPrice)
				buyingPrice = a[i];
			
			if (a[i]>a[i+1] && a[i] > buyingPrice){
				profit = profit + (a[i]- buyingPrice);
				buyingPrice = a[i+1];
			}
			else if (i+1 == len && a[i+1] > buyingPrice){
				profit = profit + (a[i+1]- buyingPrice);
			}
		}
		return profit;
	}

}