public class StrengthHero extends Superhero{
    //strength max in deadlifting;
    private double liftingCapacitykg;
    private double liftingCapacitylbs;
    public StrengthHero(String name,String place, double liftingCapacitykg){
        super(name, place);
        liftingCapacitykg = 75;
    }
    private double kgtolbs(double liftingCapacitykg, double liftingCapacitylbs){
        liftingCapacitylbs = liftingCapacitykg*2.205;
        return liftingCapacitylbs;
    }
    public String getMotto(){
        return super.getMotto() + get_name() + " with a deadlift pr of " + liftingCapacitykg + "kg/" + liftingCapacitylbs + "lbs!";
    }
}