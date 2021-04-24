public class Cash extends Payment{
  private float amountPaid;
  private float amountReturned;

  public void setAmountPaid(float amountPaid){
    this.amountPaid=amountPaid;
  }

  public float getAmountPaid(){
    return amountPaid;
  }
}
