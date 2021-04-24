public class Debit extends Payment{
  private String cardNumber;

  public void setCardNo(String cardNumber){
    this.cardNumber = cardNumber;
  }

  public String getCardNo(){
    return cardNumber;
  }
}
