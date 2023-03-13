public  class Superhero
   {
   private String name;
   private String place;
   
   public Superhero(String initialName, String cityOrPlanet)
      {
      name = initialName;   
      place = cityOrPlanet;
      } // end one-arg constructor
   public String get_name()
      {
      return name;
      }
   public String get_city()
      {
      return place;
      }
   public String getMotto()
      {
      return "I am ";
      }
   } // end class Superhero 