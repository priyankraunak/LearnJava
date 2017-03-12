
public class Light {
    public static void main(String args[]) {
        int lightspeed;
        long seconds, days, distance;
        lightspeed = 186000;
        days = 1000;
        seconds = 24 * 60 *60* days;
        distance = lightspeed * seconds;
        System.out.println("Light will travel " + distance + " miles in " + days + " days");
    }

}
