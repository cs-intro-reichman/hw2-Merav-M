// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int nNumOfTerms = Integer.parseInt(args[0]);

		double dPiApproximated = 0.0;
		for (int i = 0; i < nNumOfTerms; i++) {
			double dTerm = 1.0 / (2 * i + 1);
			if (i % 2 == 0) {
				dPiApproximated += dTerm;
			} else {
				dPiApproximated -= dTerm; 
			}
		}
		dPiApproximated *= 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated: " + dPiApproximated);

	}
}
