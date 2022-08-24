//  compute the distance light will travel
class Ch_2_02_lightspeed{
    public static void main(String args[]){
        int lightspeed;
        long days, seconds, distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("In  " +days+ " days light will travel about " +distance+ " miles.");
    }
}