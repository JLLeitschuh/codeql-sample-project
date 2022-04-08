package codeql.sample.project;

import java.io.File;

public class FileFlow {
    public static void fileFlowDemo() {
        File f = new File("/tmp/foo");
        File f1 = f;
    }

    public static void fileFlowDemo2() {
        File f = new File("/tmp/foo");
        File f1 = identity(f);
    }

    private static File identity(File f) {
        return f;
    }

    public static void fileFlowDemo3() {
        File f = new File("/tmp/foo");
        f.delete();
        f.mkdirs();
    }
}
