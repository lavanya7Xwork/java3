class RedChilliesEntertainmentRunner{
public static void main(String[] args){
boolean movies=RedChilliesEntertainment.addMoviesActors("shah ruka khan");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("juhi chawla");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("sudeep");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("darsha");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("Yash");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("Ramesh Aravind");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("Upendra");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("Radhika Pandit");
System.out.println(movies);
 movies=RedChilliesEntertainment.addMoviesActors("rakshitha");
System.out.println(movies);
 RedChilliesEntertainment.getMoviesActors();
boolean value=RedChilliesEntertainment.updateMoviesActors("rakshitha","ammu");
 RedChilliesEntertainment.getMoviesActors();
 RedChilliesEntertainment.deleteMoviesActors("Upendra");
 RedChilliesEntertainment.getMoviesActors();
 }
}