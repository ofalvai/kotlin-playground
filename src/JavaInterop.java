import kotlin.Unit;

import java.util.Arrays;

public class JavaInterop {

    private static void test() {
        
        NullSafety nullSafety = new NullSafety();

        int length = nullSafety.cantReturnNull().length();

        int lengthOrNpe = nullSafety.canReturnNull().length();

        User user = new User();
        user.setEmail("test@test.com");

        String bio = user.getBio();
        int length2 = bio.length();

        Preferences defaultPref = new Preferences();
        Preferences customPref = new Preferences(1, false);

        FunctionsKt.displayList(Arrays.asList("One", "Two"));

        LambdaKt.higherOrderTest(() -> "Hello World");
    }


}
