public class AquaHero extends Superhero
{
    //speed in mph
    private int swimspeed;
    public AquaHero(String name,String place, int Swimspeed)
    {
        super(name, place);
        swimspeed = 5;
    }
    public String getMotto()
    {
        return super.getMotto() + get_name() + " of " + get_city() + "!";
    }
}