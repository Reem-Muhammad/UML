public class Cashier{

  private String name;
  private int id;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
  public void setID(int id){
    this.id = id;
  }

  public int getID(){
    return id;
  }

  public void recordItemInfo(SalesTransaction trans, Items item){
    trans.addItem(item);
  }
//################################################################################
  public void giveTransDetailsToCust(SalesTransaction trans, Customer cust){

//#??????????????????????
  }
//################################################################################
public void handReceipt(SalesTransaction trans, Customer cust){
  CheckPoint cp = new CheckPoint();
  receipt = cp.generateReceipt(trans);
  cust.receiveReceipt(receipt);
}


}
