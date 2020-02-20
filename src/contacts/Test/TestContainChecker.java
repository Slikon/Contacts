package contacts.Test;

import contacts.Controller.ContainChecker;
import contacts.Model.Contact;
import org.junit.Assert;
import org.junit.Test;

public class TestContainChecker {
    @Test
    public void testContains(){
        ContainChecker containChecker = new ContainChecker();
        boolean result = containChecker.contains(Contact.ARTHAS, "thas");
        Assert.assertTrue(result);
    }
    @Test
    public void testContainsTwo(){
        ContainChecker containChecker = new ContainChecker();
        boolean result = containChecker.contains2(Contact.DENIS, "800", "@mail.ru");
        Assert.assertTrue(result);
    }

}
