package entities;

public class MetodoRecursivo {

	public static int somaRecursiva(int a, int b, int c) {

		if (a == 0 && b == 0 && c == 0) {
			return 0;
		} else {
			return a + somaRecursiva(b, c, 0);
		}
	}
	/*
	 * public static int CalcPotencia(int n, int p) {
	 * 
	 * if (p > 1) { return n * CalcPotencia(n, p -1); } else { return n; } }
	 */
}
