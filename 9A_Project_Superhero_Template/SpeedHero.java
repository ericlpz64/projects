public class SpeedHero extends Superhero
{
    //topspeed in mph
    private int topspeed;
    public SpeedHero(String name,String place, int Swimspeed)
    {
        super(name, place);
        topspeed = 5;
    }
    public String getMotto()
    {
        return super.getMotto() + get_name() + " of " + get_city() + "!";
    }
}