public class PractuceTwo {
    public static void main(String[]args){
        int [][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(total(a));
        System.out.println(rowValue(a));
    }
    public static double total(int[][]b){
       double total =0;
       double sum = 0;
        for(int row =0;row<b.length;row++ ){
            sum=0;
            for(int col =0;col<b[row].length;col++){
                total = total+b[row][col];
                sum = sum+b[row][col];
                
            }
            System.out.println("the sum of row "+row+ " is "+ sum);
        }
       double avg= total/b.length;
       
        return avg;
    }
    public static double rowValue(int[][]c){
        double total = 0;
        double sum =0;
        int count =0;
        for(int[]row:c){
            sum =0;
            for(int col:row){
                total = total+col;
                sum = sum+col;
            }
            System.out.println("the sum of row "+count+ " is "+ sum);
            count++;
        }
        double avg =total/c.length;
        
        return avg;
    }
}
