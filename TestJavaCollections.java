import java.util.*; 

class TestJavaCollections{  
public static void main(String [] args)
{  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  

list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ramesh");  
list.add("Ajay"); 
  list.add("Teja");
  list.add("Ranganath");
list.add("Rohit");

System.out.println("Hello world");
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
