public class BarkingDog {


    public static void main(String[] args) {
        bark(false, 7);

    }



    public static boolean bark(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ((barking && hourOfDay < 8) || (barking && hourOfDay > 22)) {
           return true;

        } else {
            return false;

        }
    }

}

