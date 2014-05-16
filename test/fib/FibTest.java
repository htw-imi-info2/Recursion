package fib;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibTest {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 },
				{ 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }, { 7, 13 },{8,21} });
	}

	int n;
	long fib;

	public FibTest(int n, long fib){this.n=n;this.fib = fib;}

	@Test
	public void testRecursive() {
		assertEquals(fib,Fib.fib(n));
	}
	@Test
	public void testLoop() {
		assertEquals(fib,Fib.fibLoop(n));
	}

}
