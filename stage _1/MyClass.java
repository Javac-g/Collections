import java.util.*;


public class MyClass {
    public static void printAll(Iterable<?> iterable){
       Iterator<?> iterator = iterable.iterator();
       while(iterator.hasNext()){
           Object object = iterator.next();
           System.out.println(object);
       }
    }
    public static void main(String args[]) {
        
      List<Integer> list = new ArrayList<>();
      
      list.add(245);
      list.add(321);
      list.add(900);
      list.add(921);
      
      printAll(list);
    }
}
