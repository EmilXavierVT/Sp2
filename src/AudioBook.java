public class AudioBook extends Title implements IAudioBook{

     private final int  durationMinutes;

    AudioBook(String title, String literatureType, int copies, int durationMinutes){
        super(title, literatureType);
        this.durationMinutes = durationMinutes;
        this.copies =copies;
    }

@Override
protected double calculatePoints(){

    return ((durationMinutes*.5) * convertLiteratureType()*this.copies) ;

}

}