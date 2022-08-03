class ScrabbleRunner {

    public static void main(String[] args) {
        Scrabble scrabble = new Scrabble("");
        scrabble.score();   // => 0

        Scrabble scrabble = new Scrabble(null);
        scrabble.score();   // => 0

        Scrabble scrabble = new Scrabble("a");
        scrabble.score(); // => 1

        Scrabble scrabble = new Scrabble("f");
        scrabble.score(); // => 4

        Scrabble scrabble = new Scrabble("street");
        scrabble.score(); // =>, 6

        Scrabble scrabble = new Scrabble("quirky");
        scrabble.score(); // => 22

        Scrabble scrabble = new Scrabble("OXYPHENBUTAZONE");
        scrabble.score(); // => 41
    }
}
