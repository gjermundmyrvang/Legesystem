class Vanedannende extends Legemiddel {

    // Heltall som sier hvor vanedannende det er
    public final int vanedannende;

    Vanedannende(String n, int p, double v, int vane) {
        super(n, p, v);
        vanedannende = vane;
    }



    @Override
    public String toString() {
       return super.toString() + "\nType: Vanedannende" + "\nVanedannende styrke: " + vanedannende;

    }

    int hentStyrke() {return vanedannende;}

}
