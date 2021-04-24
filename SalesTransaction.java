public class SalesTransaction{
  private int nItems=0;
  private String[] itemsList;
  private float salesTotal;
  private float tax;
  private int customerID;
  private int cashierID;

  public void addItem(ITems item){
    //append item to itemsList
    this.nItems +=1;
  }

  public float getSalesTotal(){
    float salesTotal = 0;
    for(Items item:itemsList){
      salesTotal += item.price;
    }
    return salesTotal;
  }

  public float getTax(){
    return tax;
  }

  public int getNoItems(){
    return nItems;
  }


}
