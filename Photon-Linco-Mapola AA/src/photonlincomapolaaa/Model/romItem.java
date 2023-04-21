package photonlincomapolaaa.Model;

public class romItem extends item{
  protected String affectionType;
  
  public romItem(String n, String t) {
    super(n, 5);
    affectionType = t;
  }
  
  public void changeVal(loveInt recipient){
    //to add if-else for x2 multiplier with matching affection types
    recipient.setAP(recipient.getAP() + incNum);
  }
}