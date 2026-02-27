public class PracticeThree {
    public static void main(String[]args){
        int [][] arr = {{1,2,3},{2,5,9},{0,7,23},{35,16,82}};
        System.out.println(SmallestValue(arr));
}
    public static int SmallestValue(int [][]a){
        int min = a[0][0];
        for (int row =0 ;row<a.length;row++){
            for(int col =0;col<a[row].length;row++){
                if (min> a[row][col]){
                    min = a[row][col];
                }
            }
        }
        return min;
    }
}
