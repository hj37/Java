package object;

public class DeckTest {
	public static void main(String args[]) {
		Deck d = new Deck(); //ī�� �� ��(Deck)�� �����.
		Card2 c= d.pick(0); 	//���� ���� ���� ���� ī�带 �̴´�.
		System.out.println(c);
		d.shuffle();	//ī�带 ���´�.
		c = d.pick(0);	//���� �Ŀ� ���� ���� ī�带 �̴´�.
		System.out.println(c);
	}
}

// DeckŬ����
class Deck {
	final int Card2_NUM = 52;
	Card2 c[] = new Card2[Card2_NUM];

	Deck() { // Deck�� ī�带 �ʱ�ȭ�Ѵ�.
		int i = 0;

		for (int k = Card2.KIND_MAX; k > 0; k--) {
			for (int n = 1; n < Card2.NUM_MAX
					+ 1; n++) {
				c[i++] = new Card2(k, n);
			}
		}

	}

	Card2 pick(int index) { // ������ ��ġ(index)�� �ִ� ī�� �ϳ��� �����Ѵ�.
		return c[index % Card2_NUM];
	}

	Card2 pick() {
		int index = (int) (Math.random()
				* Card2_NUM);
		return pick(index);
	}

	void shuffle() { // ī���� ������ ���´�.

		for (int n = 0; n < 1000; n++) {
			int i = (int) (Math.random()
					* Card2_NUM);
			Card2 temp = c[0]; // ù ��° ī��� ���Ƿ� ���õ� ī�带 ���� �ٲ۴�.
			c[0] = c[i];
			c[i] = temp;
		}

	}

}

// Card2Ŭ����
class Card2 {
	static final int KIND_MAX = 4; // ī�� ������ ��
	static final int NUM_MAX = 13; // ���̺� ī���� ��

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card2() {
		this(SPADE, 1);
	}

	Card2(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String kind = "";
		String number = "";

		switch (this.kind) {
		case 4:
			kind = "SPADE";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		case 2:
			kind = "HEART";
			break;
		case 1:
			kind = "CLOVER";
			break;
		default:
		}
		switch (this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;
		default:
			number = this.number + "";
		}
		return "kind : " + kind + ",number:"
				+ number;
	}
}
