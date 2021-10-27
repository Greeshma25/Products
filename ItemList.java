package itemList.co.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemList {
	static List<Item> iList=new ArrayList();
	public static void main(String[] args) {
		iList.add(new Item(1,"Fan",1000,"Usha"));
		iList.add(new Item(1,"TV",3500,"Trackon"));
		iList.add(new Item(1,"Fridge",6000,"Tortoise"));
		iList.add(new Item(1,"AC",3900,"Tanzah"));
		iList.stream().filter(x->x.brand.toLowerCase().contains("t")).forEach(i->System.out.println(i.brand));
		
				 
		 System.out.println("Descending Order of Price is: ");
	        System.out.println("itemId"
	                           + " "
	                           + "description"
	                           + " "
	                           + "price");
	        
	        Collections.sort(iList, new ItemComparator());
	        for (Item item : iList) {
	            System.out.println(item.itemId + " "
	                               + item.description + " "
	                               + item.price + " " + item.brand);
	        }

	}

}

class Item{
	int itemId;
	String description;
	int price;
	String brand;
	Item(int itemId,String description,int price,String brand){
		this.itemId=itemId;
		this.description=description;
		this.price=price;
		this.brand=brand;
	}
}

class ItemComparator implements Comparator<Item> {
  
    public int compare(Item l1, Item l2)
    {
        if (l1.price == l2.price) {
            return 0;
        }
        else if (l1.price < l2.price) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
