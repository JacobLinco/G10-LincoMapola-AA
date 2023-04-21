package photonlincomapolaaa.Model;

public class playerItem extends item{
  protected String statType;

  
  public playerItem(String n, String t, int i) {
    super(n, i);
    statType = t;
  }
  
  public void changeVal(player player, String s){
    switch(s) {
      case "intelligence":
        player.intelligence += incNum;
      case "happiness":
        player.happiness += incNum;
      case "charisma":
        player.charisma += incNum;
    }
  }
}