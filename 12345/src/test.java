import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@org.junit.Test
	public void test() {
		gui a = new gui();
		a.start();
		a.t15.setValue(225.25);
		a.t16.setValue(45.14);
		a.t8.setValue(121.92);
		a.t7.setValue(2);
		a.t3.setValue(800);
		a.t1.setValue(31);
		a.Confirm.doClick();
		assertEquals(a.res4.getText(), "183,94");
	}
}
