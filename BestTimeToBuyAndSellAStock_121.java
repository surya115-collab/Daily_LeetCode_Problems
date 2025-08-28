public class BestTimeToBuyAndSellAStock_121 {
    public static int maxProfit(int[] ar){
        int maxP=0,currentProfit=0,buy=0,sell=1;
        while(buy<ar.length && sell<ar.length){
            if(ar[buy]>ar[sell]){
                buy=sell;
            }
            else{
                currentProfit=ar[sell]-ar[buy];
                maxP=Math.max(maxP,currentProfit);
            }
            sell++;
        }
        return maxP;
    }
    public static void main(String[] args) {
        int[] arr={7,8,2,1,6,7};

        int result=maxProfit(arr);
        System.out.println(result);
    }
}
