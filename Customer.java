public class Customer{
  private String name;
  private int id;
  private Items[] itemList;
  private String[] receipt;

  public void addItem(Items item){
    //append item to itemList
  }

  public Items[] getItemList(){
    return itemList;
  }

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

  public receiveReceipt(String[] receipt){
    this.receipt = receipt;
  }

  public String[] getReceipt(){
    return receipt;
  }


}
