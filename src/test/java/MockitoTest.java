
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

	@RunWith(MockitoJUnitRunner.class)
	public class MockitoTest {
		
		private Agenda agendaMock ;
	
	@Before
	public void init() {
		Agenda agendaMock = Mockito.mock(Agenda.class);
		}
	
	@Test
	public void testValidaBairroSarandi() {
		Agenda agenda = Mockito.mock(Agenda.class);
		when(agenda.achaEnderecoSarandi("Toledo")).thenReturn("Sarandi");
		Assert.assertEquals("Sarandi", agenda.achaEnderecoSarandi("Toledo"));
		
	}
	

}
