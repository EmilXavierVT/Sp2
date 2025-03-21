public class PrintedBook extends Title {
    final private int pages;

    PrintedBook(String title, String literatureType, int copies, int pages){
    super(title, literatureType);
    this.pages = pages;
    this.copies =copies;

    }
    @Override
    protected double calculatePoints(){
        return (this.pages * convertLiteratureType()* this.copies);
    }

}
