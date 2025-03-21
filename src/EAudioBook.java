public class EAudioBook extends NetBook implements IAudioBook {
    private final int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (this.durationInMinutes / 2) * this.convertLiteratureType() * this.getPseudoCopies();
    }
}
