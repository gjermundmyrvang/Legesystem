class Spesialist extends Lege
 implements Godkjenningsfritak {


    public final String kontrollkode;
    Spesialist(String n, String k) {
        super(n);
        kontrollkode = k;
    }

    @Override
    public String hentKontrollkode() {
        return kontrollkode;
    }

    @Override
    public String toString() {
        return  "Dr." + navn + " (SPESIALIST)"
                + "\nKontrollkode: " + kontrollkode;

    }




}
