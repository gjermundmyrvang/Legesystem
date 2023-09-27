abstract class Resept {
    public final Legemiddel legemiddel;
    public final Lege utskrivendeLege;
    Pasient pasient;
    protected int reit;
    // Samme som i legemiddel klassen bruker jeg en static variabel for å kunne
    // gi objekter unike id'er
    protected static int id;
    public final int nyId;

    Resept(Legemiddel l, Lege lege, Pasient p, int r) {
        legemiddel = l;
        utskrivendeLege = lege;
        pasient = p;
        reit = r;
        nyId = id;
        id++;
    }



    public int hentId() {
        return nyId;
    }
    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }
    public Lege hentLege() {
        return utskrivendeLege;
    }
    public int hentPasientId() {
        return pasient.hentId();
    }

    public int hentReit() {
        return reit;
    }
    public boolean bruk() {
        if (reit > 0) {
            reit--;
            return true;

        }
        else {
            return false;
        }
    }

    abstract public String farge();
    abstract public int prisAaBetale();

    // Bruker toString() for å skrive ut informasjon om legemiddelet
    @Override
    public String toString() {
        return
                  "Resept ID: " + nyId
                + "\nLegemiddel: " + legemiddel.navn
                + "\nUtskrivende lege: " + utskrivendeLege
                + "\nPasient id: " + pasient.hentId()
                + "\nReit: " + reit
                + "\nFarge: " + farge()
                + "\nPris å betale: " + prisAaBetale();


    }




}
