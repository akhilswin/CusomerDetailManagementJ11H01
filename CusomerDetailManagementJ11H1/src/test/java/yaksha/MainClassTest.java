package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class MainClassTest {
	
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}
	
	@Test
	void testConvertCsvToMap() throws Exception {
		// Test will pass
		List<String> csvList = new ArrayList<String>();/////
		String expectedResult[] = { "New York=1", "Texas=2" };
		List<String> list1 = Arrays.asList(expectedResult);
		Map<String, Integer> tm = CustomerDetailManagement.convertCsvToMap(csvList);
		var list2 = Arrays.asList(tm);
		yakshaAssert(currentTest(), (list1.containsAll(list2) ? "true" : "false"), businessTestFile);
	}
}
