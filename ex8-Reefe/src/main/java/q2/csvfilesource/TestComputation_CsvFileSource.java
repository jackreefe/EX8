package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   // TODO: Write your answer to complete this test case
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount() throws Exception {

	  Computation com = new Computation();
	  
	  int input1 = 100, input2 = 1, expected1 = 20;
      int result1 = com.getDiscount(input1, input2); 
      
      int input3 = 101, input4 = 2, expected2 = 30;
      int result2 = com.getDiscount(input3, input4);
      
      int input5 = 102, input6 = 3, expected3 = 40;
      int result3 = com.getDiscount(input5, input6);
      
      Assert.assertEquals(result1, expected1);
      Assert.assertEquals(result2, expected2);
      Assert.assertEquals(result3, expected3);

   }
}
