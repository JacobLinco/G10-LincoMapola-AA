package photonlincomapolaaa.Model;

import java.util.ArrayList;


public class player extends chara{
  protected double money;
  protected int intelligence, charisma, happiness;
  protected ArrayList<item> inventory = new ArrayList<>();

  public player(String n, String i, location l, double m, int g, int c, int h){
      super(n,i,l);
      money = m;
      intelligence = g;
      charisma = c;
      happiness = h;
    }

  public void use(playerItem i) {
    inventory.remove(i);
    //add item changeVal method
  } 

  //temporary assignment for stats
  public void playerInc(String s) {
    switch(s) {
      //balancing needed
      case "study":
        intelligence += 5;
        happiness -= 3;
      case "job":
        money += 100;
        happiness -= 3;
        intelligence -= 1;
      case "game":
        happiness += 5;
        intelligence -= 3;
      case "invictus":
        charisma += 5;
    }
  }



  public void romance(loveInt i, String input){
    if(i.getAffType().equals(input)){
      i.setAP(i.getAP()+10);
    }
    else {
      i.setAP(i.getAP()+5);
    }
  }

  public void romance(loveInt l, String input, romItem i){
    inventory.remove(i);
    if(l.getAffType().equals(input)){
      l.setAP(l.getAP()+5);
    }
    else {
      l.setAP(l.getAP()+5);
    }
  }
  


  //setters & getters
  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
}

  public void setCharisma(int charisma) {
    this.charisma = charisma;
  }

  public void setHappiness(int happiness) {
    this.happiness = happiness;
}
  public void setMoney(double money){
    this.money = money;
  }  
  
}