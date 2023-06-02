import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class FindingsList {
    public FindingsList() throws InterruptedException {

        Thread.sleep(500);

        System.out.println("Welcome back from your expedition.");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("The last item is not a rock. Please delete it.");

        rockList.remove("not rock");

        System.out.println(rockList);
        System.out.println("Perfect :)");


        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implying there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown animal");
//        System.out.println(fossilDirectory);

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth Fossil)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Tooth Fossil"));
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun-gun");
        supplies.add("Insta-Heal Capsules");

        System.out.println("Supplies Before Expedition:");
        System.out.println(supplies); // prints out an array

        supplies.remove("Stun-gun");
        System.out.println("Supplies After Expedition:");
        //connect the iterator to your data
        Iterator itr = supplies.iterator();

        //a loop that allows you to print each item
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }




    }
}
