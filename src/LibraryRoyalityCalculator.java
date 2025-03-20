public class LibraryRoyalityCalculator {

    public static void main(String[] args) {
        //author
        Author JK = new Author("J.K.Rollin");
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

        System.out.println("Total Royality: " + Test.calculateTotalPay() + " DKK");







    }

}