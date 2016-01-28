import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemove {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(Arrays.asList(1, 3, 4, 5, 6));
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.remove(new Integer(3));
		System.out.println(l);
		intTEst(1);
	}

	public static void intTEst(long i) {
		System.out.println(i);
	}

}
