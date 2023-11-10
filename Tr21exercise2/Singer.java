public class Singer {

String name;
  int noOfPerformances;
  double earnings;
  Song favoriteSong;

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







  
}