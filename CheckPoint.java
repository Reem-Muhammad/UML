public class CheckPoint{
  private int id;
  private int cashierID;

  public void displayItem(Items item){

    System.out.println("Item Description: " + item.description);
    System.out.println("Item Price: " + item.price);
  }

  public String[] generateReceipt(SalesTransaction trans){

    String receipt = new String[100];
    int i;
    for (i=0; i<length(trans.itemsList);i++){
      receipt[i]= trans.itemsList[i].description +": "+ Float.toString(trans.itemsList[i].price);
    }
    receipt[i++] = "Sales Total: "+Float.toString(trans.salesTotal);
    receipt[i++] = "Tax: "+Float.toString(trans.tax);
    receipt[i] = Int.toString(cashierID);
  }

  public void updateInventory(Items item){
    for(String val: Inventory.itemsList){
      if(val !="empty"){
        val = item.description + ": "+ Float.tostring(item.price);
        break;
      }
    }
  }


}
