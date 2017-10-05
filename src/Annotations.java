import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Annotations {

    @Nullable
    private String getValueOrNull() {...}

    private void process() {
        String value = getValueOrNull();
        int length = value.length(); // Warning
        System.out.println("Length of " + value + ": " + length); // OK
        saveValue(value); // Warning

        @Nullable String valami = "valami";
    }

    private void saveValue(@NotNull String value) {
        byte[] bytes = value.getBytes();
    }
}
