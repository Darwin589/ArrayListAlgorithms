import java.util.*;
public class Dupe {
  public static void main(String[]args){
    ArrayList <Integer> arr = new ArrayList<Integer>();
    for(int i =0;i<20;i++){
      arr.add(Math.random()*10);
      System.out.print(arr+" ");
    }
    System.out.println(removeDupelicates(arr));
  }
  public static void removeDupelicates(ArrayList <Integer>list){
    for(int i =0; i<list.size();i++){
      for(int j =i+1;j<list.size();j++){
        if(list.get(i)==list.get(j)){
          System.out.println("Removed: "+list.get(i));
          list.remove(i);
          i--;
          j--;
        }
      }
    }
    System.out.println(list);
  }
}
