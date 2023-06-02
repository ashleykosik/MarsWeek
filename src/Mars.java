public class Mars {
    private static boolean landingCheck(int minutesLeft) throws InterruptedException  {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 2) == 0) && ((minute % 3) == 0)) {
                System.out.println("Center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;

    }
    public static void main(String[] args) throws InterruptedException {

        String colonyName = "The First Java Explorers";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        //Beginning with the landing process and continuing until food production is underway on Mars,
        // everyone will eat 0.75 meals a day to preserve food. The landing process takes 2 days.
        //Calculate how many meals are left after landing using mathematical operators.
        double landingFoodEaten = shipPopulation * 0.75; //225
        meals = meals - landingFoodEaten;
        System.out.println(meals + " meals left"); //3775

        //An extra crate of food is found increasing meals by 50%!
        double extraFood = meals / 2;
        meals += extraFood;

        //5 more babies join the population during the 2 days it takes to land
        int babies = 5;
        shipPopulation += babies;

        //The ship is coming into its final descent & you need to figure out where to land.
        String landingLocation = "The Plain";

        if (landingLocation.equals("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }


        landingCheck(10);

        new GuessingGame();

        new MarsExpedition();

        new FindingsList();
    }
}