public class LibraryRoyalityCalculator {

    public static void main(String[] args) {
        //author
        Author JK = new Author("J.K.Rowling");
        Author Test = new Author("Olga Ravn");


        //books
        PrintedBook HarryPotter = new PrintedBook("Harry potter","SKØN",50,223);
        AudioBook HarryPotterEBook = new AudioBook("Harry potter","SKØN",50,223);



        PrintedBook test1 = new PrintedBook("Celestine", "SKØN",140,166);
        AudioBook   test2 = new AudioBook  ("Celestine", "SKØN",140,192);
        // we add the Titles to the arrayList that in turn is linked to the author
        JK.addTitle(HarryPotter);
        JK.addTitle(HarryPotterEBook);
        Test.addTitle(test1);
        Test.addTitle(test2);

        JK.addTitle(new EAudioBook("Harry Potter", "FAG",97,50,205,482));
        JK.addTitle(new EBook("Harry Potter", "FAG",1,97,50,205,360000,true));

        System.out.println("Total Royality for "+JK.getName()+":   "  + JK.calculateTotalPay() + " DKK");







    }

}