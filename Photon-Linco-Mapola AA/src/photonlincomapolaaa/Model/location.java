package photonlincomapolaaa.Model;

import java.util.ArrayList;

public class location {
  protected String name;
  protected ArrayList<chara> characterList = new ArrayList<>();

  public void changeChar(location loc1, location loc2, chara chara) {
    loc1.characterList.remove(chara);
    loc2.characterList.add(chara);
  }
  
  
  //getters & setters
  public String getName() {
        return name;
    }

  public ArrayList<chara> getCharacterList() {
        return characterList;
    }
}