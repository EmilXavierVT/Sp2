public class EAudioBook extends NetBook implements IAudioBook{
    private int durationInMinutes;
    public EAudioBook(String title,String literatureType, int availability, int reach, int use, int durationInMinutes){
        super( title,  literatureType, durationInMinutes, availability, reach, use);
        this.durationInMinutes =durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return ( (double) durationInMinutes /2) *convertLiteratureType()*((reach*5)+(availability*0.5)+use);
    }
}
