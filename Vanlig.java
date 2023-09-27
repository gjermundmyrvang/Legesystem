class Vanlig extends Legemiddel {


    // Ingen tilleggsegenskaper
    Vanlig(String n, int p, double v) {
        super(n, p, v);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Vanlig";

    }



}


