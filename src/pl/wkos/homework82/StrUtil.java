package pl.wkos.homework82;

public class StrUtil {
    public static String putTabs(int n) {
        String buffer = "";
        for (int i = 0; i < n; i++) buffer += "\t";
        return buffer;
    }

    public static String putNewLineAndTabs(int n) {
        String buffer = "\n";
        for (int i = 0; i < n; i++) buffer += "\t";
        return buffer;
    }
}
