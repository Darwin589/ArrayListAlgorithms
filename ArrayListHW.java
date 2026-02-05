/*import java.util.*;
public class ArrayListHW{
  public static void main(String[]args){
      ArrayList<Integer> list = new ArrayList <Integer>();
      for(int i = 0;i <50;i++){
          list.add((int)Math.random()*100);
      }
       System.out.println(ArrayListSum(list));
       System.out.println(ArrayListAvg(list));
       System.out.println(ArrayListMax(list));
       System.out.println(ArrayListMin(list));
  }
  public static ArrayList<Double> ArrayListSum (ArrayList<Integer>arr){
      ArrayList<Integer> Sum = new ArrayList<Integer>();
      Double result =0.0;
      for(int i = 0;i<arr.size();i++){
          result += arr.get(i);
      }
      return result;
  }
  public static ArrayList<Double> ArrayListAvg (ArrayList<Integer>arra){
      Integer sum = 0;
      Double avg = 0.0;
      for(int i =0; i<arra.size();i++){
          sum += arra.get(i);
      }
      avg = (double)sum/arra.size();
      return avg;
  }
  public static ArrayList<Integer> ArrayListMax (ArrayList<Integer>ar){
   Integer max  = ar.get(0);
   for(int i =0;i<ar.size();i++){
       if(max<ar.get(i)){
           max = ar.get(i);
       }
   }
   return max;
  }
  public static ArrayList<Integer> ArrayListMin (ArrayList<Integer>array){
   Integer min  = array.get(0);
   for(int i =0;i<array.size();i++){
       if(min>array.get(i)){
           min = array.get(i);
       }
   }
   return min;
  }
}
*/