// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String sWord = args[0];
        String sUpperCasedWord = "";

        int nWordLength = sWord.length();

        for (int i = 0; i < nWordLength; i++) {
                char nCh = sWord.charAt(i);
                if (nCh >= 'a' && nCh <= 'z') {
                    nCh = (char) (nCh - 'a' + 'A');
                }
                sUpperCasedWord += nCh;
        }
    
        
        for ( int i = 0 ; i <nWordLength ; ++i) {

                String cArticle = "an";
                char cCurrChar = sUpperCasedWord.charAt(i);
                if ("AEFHILMNORSX".indexOf(cCurrChar) == -1) {
                        cArticle = "a";
                }
                System.out.println("Give me " + cArticle + ":" + sUpperCasedWord.charAt(i));
        }

        System.out.println("What does that spell?");

        int nNumOfTimes = Integer.parseInt(args[1]);

        for (int j = 0; j<nNumOfTimes; ++j) {
                System.out.println(sUpperCasedWord + " !!!");
        }
}
}
