import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //    Happy Test for first name, first letter - capital letter
    @Test
    public void firstNameHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.firstName("Rahul");
        Assert.assertTrue(happyTest);
    }

    //    Sad Test for first name, first letter - capital letter
    @Test
    public void firstNameSadTest1() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.firstName("rahul");
        Assert.assertFalse(sadTest);
    }

    //    Happy Test for last name, first letter - capital letter
    @Test
    public void lastNameHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.lastName("Girgal");
        Assert.assertTrue(happyTest);
    }

    //    Sad Test for last name, first letter - capital letter
    @Test
    public void lastNameSadTest() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.lastName("girgal");
        Assert.assertFalse(sadTest);
    }

    //    Sad Test for last name, first letter - capital letter
    @Test
    public void emailHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.email("rahul4girgal@gmail.com");
        Assert.assertFalse(happyTest);
    }

    @Test
    public void emailSadTest() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.email("rahulgirgal.co.in");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void mobNoHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.mobileNumber("91 8446448194");
        Assert.assertTrue(happyTest);
    }

    @Test
    public void mobNoSadTest() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.mobileNumber("8446448194");
        Assert.assertFalse(sadTest);
    }
    @Test
    public void passwordHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.ruleOne("adsrdj");
        Assert.assertTrue(happyTest);
    }

    @Test
    public void passwordSadTest1() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleOne("jsg$12gf");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest2() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleTwo("fdld23$df");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest3() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleThird("haajh$jf12d");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest4() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleFourth("asjd524t^$df");
        Assert.assertFalse(sadTest);
    }
}