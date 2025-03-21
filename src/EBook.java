public class EBook extends NetBook{
    private double characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability,int reach, int use,double character,boolean illustrated) {
        super(title, literatureType, availability , reach, use);
        this.characters=characters;
        this.illustrated=illustrated;

    }
    private double calculatePages(){
        if(illustrated){
        return ((characters/1800+20)* 1.1);
        }
        return characters/1800+20;
    }

    @Override
    protected double calculatePoints() {
        return this.calculatePages() * this.convertLiteratureType() *  this.getPseudoCopies();
    }
}
