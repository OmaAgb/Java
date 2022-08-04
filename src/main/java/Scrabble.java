import java.util.HashMap;

public class Scrabble {
    int score;
    String word;
    char[] letterArray;
    HashMap<Character, Integer> letters = new HashMap<>();

    Scrabble(String newWord) {
        
        letterValues();
        
        score = 0;
        
        if (newWord == null) {
            this.word = "";
        } else {
            this.word = newWord.toUpperCase();
            this.letterArray = this.word.toCharArray();
        }
    }

    int score() {
        if (word != "") {
            for (char letter : this.letterArray) {
                score += letters.get(letter);
            }
        }
        return score;
    }


//
//        void letterValues() {
//        letters.put('a', 1);
//        letters.put('e', 1);
//        letters.put('i', 1);
//        letters.put('o', 1);
//        letters.put('u', 1);
//        letters.put('l', 1);
//        letters.put('r', 1);
//        letters.put('s', 1);
//        letters.put('t', 1);
//        letters.put('d', 2);
//        letters.put('g', 2);
//        letters.put('b', 3);
//        letters.put('c', 3);
//        letters.put('m', 3);
//        letters.put('p', 3);
//        letters.put('f', 4);
//        letters.put('h', 4);
//        letters.put('v', 4);
//        letters.put('w', 4);
//        letters.put('y', 4);
//        letters.put('k', 5);
//        letters.put('j', 8);
//        letters.put('x', 8);
//        letters.put('q', 10);
//        letters.put('z', 10);
//    }


    void letterValues() {
        letters.put('A', 1);
        letters.put('E', 1);
        letters.put('I', 1);
        letters.put('O', 1);
        letters.put('U', 1);
        letters.put('L', 1);
        letters.put('N', 1);
        letters.put('R', 1);
        letters.put('S', 1);
        letters.put('T', 1);
        letters.put('D', 2);
        letters.put('G', 2);
        letters.put('B', 3);
        letters.put('C', 3);
        letters.put('M', 3);
        letters.put('P', 3);
        letters.put('F', 4);
        letters.put('H', 4);
        letters.put('V', 4);
        letters.put('W', 4);
        letters.put('Y', 4);
        letters.put('K', 5);
        letters.put('J', 8);
        letters.put('X', 8);
        letters.put('Q', 10);
        letters.put('Z', 10);
    }
}


