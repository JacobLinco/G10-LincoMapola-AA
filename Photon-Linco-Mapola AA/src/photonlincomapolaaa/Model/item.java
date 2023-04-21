package photonlincomapolaaa.Model;

public abstract class item{
  String name;
  int incNum;

  public item(String n, int i) {
    name = n;
    incNum = i;
  }
  
  public void changeVal(){
    
  }

  public void description(String text){
    System.out.println(text);
  }
}