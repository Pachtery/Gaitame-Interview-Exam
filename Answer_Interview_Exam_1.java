import java.util.ArrayList;
import java.util.TreeSet;

public class Answer_Interview_Exam_1 {
	private int a[] = new int[101];
	private int b[] = new int[101];
	private double powa = 0;
	private double powb = 0;
	private TreeSet<Double> set = new TreeSet<Double>();
	private ArrayList<Double> arrPowa = new ArrayList<Double>();
	private ArrayList<Double> arrPowb = new ArrayList<Double>();

	public void inputab() {
		for (int i = 0; i <= 100; i++) {
			a[i] = i;
			b[i] = i;
		}
	}

	public void apowb() {
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				powa = (double) Math.pow(a[i], b[j]);
				arrPowa.add((double) powa);
			}
		}
		set.addAll(arrPowa);
	}

	public void bpowa() {
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				powb = (double) Math.pow(b[i], a[j]);
				arrPowb.add((double) powb);
			}
		}
		set.addAll(arrPowa);
	}

	/*
	 * public void printpow() { System.out.println("aPowb: "+arrPowa.size());
	 * System.out.println(); System.out.println("bPowa: "+arrPowb.size());
	 * System.out.println(); System.out.println("Set: "+set.size());
	 * 
	 * }
	 */

	public void printAns() {
		/*
		 * for (double s : set) { System.out.println(s); }
		 */
		System.out.println("Output: \n" + set.size());
	}

	public static void main(String[] args) {
		Answer_Interview_Exam_1 ex = new Answer_Interview_Exam_1();
		ex.inputab();
		ex.apowb();
		ex.bpowa();
		// ex.printpow();
		ex.printAns();
	}
}
