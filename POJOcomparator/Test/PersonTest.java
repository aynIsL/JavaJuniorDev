import com.person.Person;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;


public class PersonTest {

    @Test
    public void NullNameTest() throws Exception{
        Person testPerson = null;
        String testData = null;
        String expectedValue = " ";

        try {
            testPerson = new Person.Builder().firstName(testData).lastName("Kyselov").build();
            //fail("Exception should be thrown");
        }
        catch(NullPointerException error){
            Assert.assertEquals(expectedValue, testPerson.getFirstName());
        }
    }

    @Test
    public void EmptyFirstNameTest() throws Exception{
        Person testPerson = null;
        String testData = "";
        String expectedValue = "The name shouldn't be empty";

        try {
            testPerson = new Person.Builder().firstName(testData).lastName("Kyselov").build();
            fail("Exception should be thrown");
        }
        catch(NullPointerException error){
            Assert.assertEquals(expectedValue, error.getMessage());
        }
    }

}
