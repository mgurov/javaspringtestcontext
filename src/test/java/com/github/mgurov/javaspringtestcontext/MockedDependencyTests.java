package com.github.mgurov.javaspringtestcontext;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore //NB: disabled by default
public class MockedDependencyTests {

	@MockBean
	private HeavierBean heavierBeanMock;

	@Test
	public void test1() {
	}
}

