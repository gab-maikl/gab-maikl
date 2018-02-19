import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@org.junit.Test
	public void testSharafutdinov() {
		gui a = new gui();
		a.start();
		a.t2.setValue(2);
		a.Confirm.doClick();
		assertEquals(a.res9.getText(), "1373,99");
	}
}
