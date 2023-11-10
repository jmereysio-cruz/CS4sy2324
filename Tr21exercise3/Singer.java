public class Singer {

String name;
  int noOfPerformances;
  double earnings;
  Song favoriteSong;
  static int totalPerformances;

  public Singer(String name){

  this.name = name;
    this.earnings = 0;
    this.noOfPerformances = 0;
  }

  public void performForAudience(int noOfPeople){
    noOfPerformances++;
    earnings += (100* noOfPeople);
  }

  public void changeFavSong(String newSong){
    favoriteSong.title = newSong;
  }

  public String displayFavSong(){
    return favoriteSong.title;
  }

  public String getName(){
  return name;
}

  public String getNoOfPerformances (){
  return noOfPerformances;
}

  public double getEarnings (){
    return earnings;
  }

  public String getSong (){
    return favoriteSong;
  }

  public void performForAudience (int noOfPeople, steve){
    noOfPerformances++;
    double profit = 100* noOfPeople;
    earnings+= /2;
    
  }
   
  

}