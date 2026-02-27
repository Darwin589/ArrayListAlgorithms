public class TwoDpractice {
    public static void main(String[]args){
        int [][] arr  ={{1,4,5},{1,6,8},{3,5,7},{1,6,78}};
        print(arr);
    }
    public static void print(int[][]arr1){
        for(int row = 0;row<arr1.length;row++){
            for(int col =0 ;col<arr1[0].length;col++){
                System.out.print(arr1[row][col] +" ");
            }
            System.out.println(arr1);
        }
    }
}
