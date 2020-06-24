import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class AgendaTeste {

	@Test
	public void testAgendaSucesso() {
		Agenda age = new Agenda();
		age.agenda("Anderson","Toledo","3321-22-48");
		Assert.assertEquals(true, age.agenda("Anderson", "Toledo","3321-22-48"));
		
	}

	@Test
	public void testAgendaNula() {
		Agenda age = new Agenda();
		age.agenda (null, null, null);
		Assert.assertEquals(false, age.agenda(null,null,null));
		
	}

}
