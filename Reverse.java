import java.util.*;
public class Reverse {
    public static void main(String[]args){

   
    
    ArrayList <String> list = new ArrayList <String>();
    list.add("dad");
    list.add("bruh");
    list.add("mom");
    list.add("mom");
    list.add("job");
    System.out.println(list);
    System.out.println(ReverseThis(list));
    System.out.println(DupeThis(list));
    System.out.println(findDuplicates(list));
    System.out.println(acessPairs(list));
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
    public static boolean findDuplicates(ArrayList<Integer> nums)
    {
        for(int i=0; i < nums.size();i++){
            for(int j =i+1;j< nums.size();j++){
                if(nums.get(i).equals(nums(j)){
                    return true;
                }
                   }
        }
        return false;
    }
    public static boolean acessPairs(ArrayList<Integer> nums)
    {
        for(int i=0; i < nums.size();i++){
            for(int j =i+1;j< nums.size();j++){
                if(nums.get(i).equals(nums(j)){
                    return true;
                }
                   }
        }
        return false;
    }
}
