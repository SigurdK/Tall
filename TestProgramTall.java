class TestProgramTall {
    public static void main(String[] args) {
        TallRekke beholder = new TallRekke(5);
        Tall en = new Tall(1);
        Tall to = new Tall(2);

        beholder.leggTil(en);
        beholder.leggTil(to);
        beholder.leggTil(en);
        beholder.leggTil(to);
        beholder.leggTil(en);
        beholder.leggTil(to);
        beholder.leggTil(to);

    }
}
