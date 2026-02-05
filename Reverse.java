import java.util.*;
public class Reverse {
    public static void main(String[]args){

   
    
    ArrayList <String> list = new ArrayList <String>();
    list.add("dad");
    list.add("bruh");
    list.add("mom");
    System.out.println(list);
    System.out.println(ReverseThis(list));
    System.out.println(DupeThis(list));
    }    
    public static ArrayList<String> ReverseThis (ArrayList<String> arr){
    ArrayList<String> response = new ArrayList<String>();
    for(int i = arr.size()-1; i >=0;i-- ){
        response.add(arr.get(i));
    }
    return response;
}
    public static ArrayList<String> DupeThis(ArrayList<String> Dupe){
    ArrayList<String> backUp = new ArrayList<String>();
    for (int i =0 ;i<Dupe.size();i++){
        backUp.add(Dupe.get(i));
        backUp.add(Dupe.get(i));
    }
    return backUp;
    }    
}
