package photonlincomapolaaa.Model;

import java.util.ArrayList;

public class loveInt extends chara{
  private int difficulty, AP;
  private String affType, favItem;
  private ArrayList<String> dialogue = new ArrayList<>();
    

  public loveInt(int d, String f, String n, String i, location l) {
    super(n, i, l);
    difficulty = d;
    AP = 50;
    affType = f;
  }
  
  //getters and setters
  public int getAP(){
    return AP;
  }

  public void setAP(int a) {
    AP = a;
  }
  
  public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getAffType() {
        return affType;
    }

    public void setAffType(String affType) {
        this.affType = affType;
    }

    public String getFavItem() {
        return favItem;
    }

    public void setFavItem(String favItem) {
        this.favItem = favItem;
    }
}