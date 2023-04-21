package photonlincomapolaaa.Model;

public abstract class chara{
  private String name, CharImageFile;
  private location location;

  public chara(String n, String i, location l) {
    name = n;
    CharImageFile = i;
    location = l;
    l.getCharacterList().add(this);
  }

  public void changeLoc(location l) {
    location = l;
  }
}