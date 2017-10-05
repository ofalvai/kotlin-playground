import java.util.Arrays;

public class JavaInterop {

    private static void test() {
        
        NullSafety nullSafety = new NullSafety();

        int length = nullSafety.cantReturnNull().length();

        int lengthOrNpe = nullSafety.canReturnNull().length();

        Preferences defaultPref = new Preferences();
        Preferences customPref = new Preferences(1, false);

        FunctionsKt.displayList(Arrays.asList("One", "Two"));
    }


}
