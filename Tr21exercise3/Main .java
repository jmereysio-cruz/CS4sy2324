public class main {

public static void main(String[] args) {



  Athlete curry = new Athlete("Stephen Curry", "Golden State Warriors", 47.5);
  
  Athlete lebron = new Athlete("Lebron James", "Los Angeles Lakers", 50.5);

  Athlete durant = new Athlete("Kevin Durant", "Pheonix Suns", 49.9);


  Song some = new Song("Some", "Steve Lacy");
  Song just = new Song("Just the Way You Are","Bruno Mars");

  Singer steve = new Singer("Steve Lacy")
  Singer bruno = new Singer("Bruno Mars");
  bruno.favoriteSong = new Song("Locked out of Heaven");

  bruno.performForAudience(12);
  bruno.changeFavSong("When I was Your Man");

  System.out.println(bruno.displayFavSong());

  bruno.performforAudience(12, steve);

  System.out.println(bruno.getEarnings());
  System.out.println(steve.getEarnings());
  
  }
}