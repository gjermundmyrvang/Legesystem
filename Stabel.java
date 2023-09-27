class Stabel <E> extends Lenkeliste <E> {

    @Override
    public void leggTil(E x) {

        Node nyNode = new Node(x);

        if (stoerrelse() == 0) {
            start = nyNode;
            slutt = nyNode;
            teller++;
            return;
        }

        // Kun opprettet en node
        // start og slutt peker på denne
        // slutt skal peke på noden som var
        // start skal peke på nye noden
        if (stoerrelse() == 1) {
            start = nyNode;
            nyNode.neste = slutt;
            slutt.forrige = nyNode;
            teller++;
            return;
        }

        // Opprettet fler enn en node
        // Legger til forst i listen
        start.forrige = nyNode;
        nyNode.neste = start;
        start = nyNode;
        teller++;
    }
}
