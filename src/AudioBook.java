public class AudioBook extends Title{

    final private int  durationMinutes;

    AudioBook(String title, String literatureType, int copies, int durationMinutes){
        super(title, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

@Override
protected double calculatePoints(){

    return ((durationMinutes*.5) * convertLiteratureType()*copies) ;

}

}