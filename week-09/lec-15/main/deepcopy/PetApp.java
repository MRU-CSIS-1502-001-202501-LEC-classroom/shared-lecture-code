package main.deepcopy;

public class PetApp {

    public static void main(String[] args) {
        Pet pippin = new Pet("Pippen", 7);

        pippin.doThis("1. wake up");
        pippin.doThis("2. ponder wisdom of waking up");
        pippin.doThis("3. go back to sleep");
        pippin.doThis("4. wake up again - this time for real");
        pippin.doThis("5. stretch");
        pippin.doThis("6. search for hooman in order to obtain food and attention");

        // 🤔 What do you expect to see here?
        System.out.println("Here's pippin:");
        System.out.println(pippin);

        // Let's take a "snapshot" of pippin at this point.
        Pet pippinCopy = new Pet(pippin);

        // 🤔 What do you expect to see here?
        System.out.println("Here's pippinCopy:");
        System.out.println(pippinCopy);

        // Now get the original pippin to do something.
        pippin.doThis("7. decide to change name");
        pippin.changeNameTo("Lothtar the Merciless");
        pippin.doThis("8. feel older");
        pippin.getOlder();

        // 🤔 What do you expect to see here?
        System.out.println(pippin);

        // 🤔 And here?
        System.out.println(pippinCopy);

        // 🤔 What's going on?

    }
}
