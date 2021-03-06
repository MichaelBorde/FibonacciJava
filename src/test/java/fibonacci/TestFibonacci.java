package fibonacci;

import static org.fest.assertions.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class TestFibonacci {

	private Fibonacci fibonacci;

	@Before
	public void avantChaqueTest() {
		fibonacci = new Fibonacci();
	}

	@Test
	public void fiboDe0Donne0() {
		assertThat(fibonacci.pour(0)).isEqualTo(0);
	}

	@Test
	public void fiboDe1Donne1() {
		assertThat(fibonacci.pour(1)).isEqualTo(1);
	}

	@Test
	public void peutCalculerLesRésultatsGénéraux() {
		assertThat(fibonacci.pour(2)).isEqualTo(1);
		assertThat(fibonacci.pour(3)).isEqualTo(2);
		assertThat(fibonacci.pour(4)).isEqualTo(3);
		assertThat(fibonacci.pour(8)).isEqualTo(21);
	}

	@Test
	public void ilEstPossibleDeConnaitreLeRésultatPourUnGrandNombre() {
		assertThat(fibonacci.pour(1337)).isGreaterThan(0);
	}
}
