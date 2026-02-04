//Darwin Castillo
import java.util.ArrayList;
public class Practice{

public static void main(String[]args){
Integer i= new Integer(30);
Double d = new Double(40.3);
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
System.out.println(d*i);
int newInt = i;
double newDouble =d;

ArrayList <String> list = new ArrayList <String>();
list.add("Micheal");
list.add("Jessica");
list.add("Lee");
list.add(1,"Sarah");
System.out.println(list);
String store = list.set(2,"Mary");
String store2 = list.get(3);
System.out.println(store2);
String store3 = list.remove(1);
int s = list.size();
System.out.println(list);
System.out.println(" ");

ArrayList<String> names = new ArrayList<String>();
names.add("bob");
names.add("mob");
names.add("tom");
names.add("axe");
names.add("body");
names.add("spray");
int index = 0;
while(names.size()>index){
System.out.println(names.get(index));
index++;
}
System.out.println(" ");
for(int we = 0;names.size()>we;we++){
    if(names.get(we).substring(0,1).equals("a")){
        names.set(we , "sue");
    }
    System.out.println(names.get(we));
}
System.out.println(" ");
for(String name:names){
    System.out.println(name);

}
System.out.println(" ");
int bye =0;
while(names.size()>bye){
    if(names.get(bye).indexOf("tom")>=0){
        names.remove(bye);
    }
        else{
        bye++;
    }    
    System.out.println(names.get(bye));
}
















}
}