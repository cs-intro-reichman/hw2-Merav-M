// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	  int nNumOfSeeds = Integer.parseInt(args[0]);
	  String sMode = args[1];

	  for(int nCurrSeed = 1; nCurrSeed <= nNumOfSeeds; nCurrSeed++) {

		String sSequence = "";
		int nCurrNum = nCurrSeed;

		sSequence += nCurrNum + " ";
		
		int nSteps = 1;

		do {
		if (nCurrNum % 2 == 0) {
			nCurrNum = nCurrNum / 2;
		}
		 else {
			nCurrNum = 3 * nCurrNum + 1;
		}

		nSteps++;
		sSequence += nCurrNum + " ";

		} while(nCurrNum != 1);

		if (sMode.equals("v")) {
			System.out.println(sSequence + "(" + nSteps + ")");
		}
	  }
	  System.out.println("Every one of the first " + nNumOfSeeds + " hailstone sequences reached 1.");
	}
}
