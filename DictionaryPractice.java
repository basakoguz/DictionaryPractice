import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice{

  public static void main(String[] args){
      //English to Spanish Dictionary
      Map<String,String> englSpanDictionary = new HashMap<String,String>();
      //Putting things inside the dictionary
      englSpanDictionary.put("Monday","Lunes");
      englSpanDictionary.put("Tuesday","Martes");
      englSpanDictionary.put("Wednesday","Miercoles");
      englSpanDictionary.put("Thursday","Jueves");
      englSpanDictionary.put("Friday","Viernes");
      englSpanDictionary.put("Saturday","Sabado");
      englSpanDictionary.put("Sunday","Domingo");
      //Retrieve records from dictionary
      System.out.println(englSpanDictionary.get("Monday"));
      System.out.println(englSpanDictionary.get("Tuesday"));
      System.out.println(englSpanDictionary.get("Wednesday"));
      System.out.println(englSpanDictionary.get("Thursday"));
      System.out.println(englSpanDictionary.get("Friday"));
      //Print all keys
      System.out.println(englSpanDictionary.keySet());
      //Print all values
      System.out.println(englSpanDictionary.values());
      //Print size
      System.out.println("The size of the dictionary is " + englSpanDictionary.size());

      System.out.println();
      System.out.println();


      //Shopping list
      Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
      // Put some staff in shopping list
      shoppingList.put("Ham",true);
      shoppingList.put("Bread",true);
      shoppingList.put("Oreos",true);
      shoppingList.put("Eggs",false);
      shoppingList.put("Sugar",false);
      //Retrieve items from list
      System.out.println(shoppingList.get("Ham"));
      System.out.println(shoppingList.get("Oreos"));
      //Key-Value Pairs Print Out
      System.out.println(shoppingList.toString());
      //Check if the list is empty
      System.out.println(shoppingList.isEmpty());
      //Remove things
      shoppingList.remove("Eggs");
      //Replace values for a certain key
      shoppingList.replace("Bread",false);
      System.out.println(shoppingList.toString());
      //Clear the list
      shoppingList.clear();
      System.out.println(shoppingList.toString());
      //Check if the list is empty
      System.out.println(shoppingList.isEmpty());
    }
  }
