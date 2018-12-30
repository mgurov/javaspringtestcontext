package com.github.mgurov.javaspringtestcontext;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "blah=fooe")
@Ignore //NB: disabled by default
public class ChangePropertiesTests {

	@Test
	public void test1() {
	}

	@Test
	public void test2() {
	}

	@Test
	public void test3() {
	}

}

