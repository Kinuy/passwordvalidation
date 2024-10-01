import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    @DisplayName("Test password length equals 8")
    public void checkPasswordLengthTest_whenLengthEquals8_thenReturnTrue() {
        //GIVEN
        String value = "Testpass";
        //WHEN
        boolean result = Main.checkPasswordLength(value);
        //THEN
        assertTrue(result);
    }
    @Test
    @DisplayName("Test password length equals 9")
    public void checkPasswordLengthTest_whenLengthEquals9_thenReturnFalse() {
        //GIVEN
        String value = "Testpassw";
        //WHEN
        boolean result = Main.checkPasswordLength(value);
        //THEN
        assertFalse(result);
    }

    @Test
    @DisplayName("Test password contains digits")
    public void checkPasswordContainsDigitsTest_when2_thenReturnTrue() {
        //GIVEN
        String value = "Testpass2";
        //WHEN
        boolean result = Main.checkPasswordContainsDigits(value);
        //THEN
        assertTrue(result);
    }

    @Test
    @DisplayName("Test password contains upper- and lowercase")
    public void checkPasswordContainsUpperAndLowerCaseLettersTest_whenUpperAndLowerCaseLetter_thenReturnTrue() {
        //GIVEN
        String value = "Testpass";
        //WHEN
        boolean result = Main.checkPasswordContainsUpperAndLowerCaseLetters(value);
        //THEN
        assertTrue(result);
    }

    @Test
    @DisplayName("Test contains commonly used passwords")
    public void checkPasswordContainsCommonlyUsedPasswordsTest_whenCommonlyUsedPwd_thenReturnTrue() {
        //GIVEN
        String value = "Password1";
        //WHEN
        boolean result = Main.checkPasswordContainsCommonlyUsedPasswords(value);
        //THEN
        assertTrue(result);
    }


}
