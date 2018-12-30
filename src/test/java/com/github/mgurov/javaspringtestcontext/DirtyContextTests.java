package com.github.mgurov.javaspringtestcontext;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore //NB: disabled by default
public class DirtyContextTests {

	@Test
	@DirtiesContext
	public void test1() {
	}

	@Test
	@DirtiesContext
	public void test2() {
	}

	@Test
	@DirtiesContext
	public void test3() {
	}

	@Test
	@DirtiesContext
	public void test4() {
	}

	@Test
	@DirtiesContext
	public void test5() {
	}

	@Test
	@DirtiesContext
	public void test6() {
	}
}

