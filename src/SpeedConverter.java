public class SpeedConverter {

    //Conversion factor from kilometers to miles
    private static final double KILOMETERS_TO_MILES_CONVERSION_FACTOR = 1.609;

    //Convert km/h to mi/h
    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        } else {
           return Math.round(kilometersPerHour / 1.609);
        }//else
    }//toMilesPerHour

    // Prints the conversion from km/h to mi/h
    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }//printConversion

    //Main for testing purpose
    public static void main(String[] args) {
        printConversion(10.25);
    }

}//SpeedConverter
