# Gaitame-Interview-Exam
----------
### ข้อที่ 1
```bash
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

 ```
 ----------
### ข้อที่ 2
### 2.1
 ```bash
  SELECT first_name, last_name,isnull(order_id,'NULL'),isnull(order_date,'NULL')
  FROM customer, order
  WHERE  customer.customer_id = order.customer_id;
 ```
 ----------
### 2.2
 ```bash
  SELECT first_name, last_name, order_id, order_date, sum(list_price) As sum of order_items.list_price
  FROM customer, order, order_item
  WHERE  customer.customer_id = order.customer_id AND order.order_id = order_item.order_id AND order_date LIKE '2018%';
 ```
 
