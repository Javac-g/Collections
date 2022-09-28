//Remove empty 

public class Task1{
  
  public static void removeEmpty(Iterable<String> iterable){
    Iterator<String> iterator = iterable.iterator();
    
    while(iterator.hasNext()){
      if(iterator.next().isEmpty()){
          iterator.remove();
      }
      
    
    }
  
  
  }
  
  
  public static void main(String...args){
  
    List<String> list = new ArrayList<>();
    list.add("One");
    list.add("Two");
    list.add("");
    list.add("");
    list.add("three");
    System.out.println(list);
    removeEmpty(list);
    System.out.println(list);
  
  }
  
}
