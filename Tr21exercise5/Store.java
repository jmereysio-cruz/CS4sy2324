import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
     itemList = new ArrayList()
     storeList.add(this);
    
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){

	if(index < itemList.size()){
	earnings += itemList.get(index).getCost();
		System.out.printf(itemList.get(index).getName() + "sold for sold for", itemList.get(index).getCost());}
	else {
	System.out.println("There are only " + itemList.size() " items in this store.");
}
}

    
  }
  public void sellItem(String name){
	boolean found = false;
for(Item i : itemlist) {
earnings += i.getCost();
System.out.printf(i.getName() + " is priced at ", i.getCost());
	found = true;
	break;
}
}
if (!found){
System.out.println("We do not sell " + name);}
}

  }
  public void sellItem(Item i){
    if(itemList.contains(i)){
earnings += i.getCost();
System.out.printf(i.getName() + " is priced at ", i.getCost());
}
else {
System.out.println("We do not sell " + i.getName());
}
  }

  public void addItem(Item i){
    itemList.add(i);
  }
  public void filterType(String type){
    for (Item i: itemList) 
{if(i.getType().equals(type)) {
System.out.println(i.getName());
}
}
  }
  public void filterCheap(double maxCost){
    for (Item i: itemList) {
if(i.getCost() <= maxCost){
System.out.println(i.getName());
	 }
	}
  }
  public void filterExpensive(double minCost){
    for (Item i: itemList) {
if(i.getCost() >= minCost){
System.out.println(i.getName());
	 }
	}
  }
  public static void printStats(){
  for (Store s: storeList) {
System.out.println(s.getName() + ": " + s.getEarnings());
	}

  }
}
