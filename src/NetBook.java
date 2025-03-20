public abstract class NetBook extends Title {
    protected int availability;// TODO: Total amount of Municipalities whom has the book
    protected int reach; // TODO: Municipalities whom rented out
    protected int use; // TODO: times checked out
    public NetBook(String title, String literatureType, int copies,int availability,int reach,int use) {
        super(title, literatureType, copies);
        this.availability=availability;
        this.reach =reach;
        this.use=use;
    }
    protected double getPseudoCopies(double pages, double litType, double points){
        return points/(pages*litType);

    }
    public  int getUseFactor(){
        return this.use;

    }


}
