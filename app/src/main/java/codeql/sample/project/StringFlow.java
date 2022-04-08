package codeql.sample.project;

public class StringFlow {
    public static String GOODBYE = "Goodbye";

    public static void stringFlowDemo() {
        String hello = "hello!";
        String hello1 = hello;
        String hello2 = hello1;
    }

    public static void stringFlowDemo2() {
        String hello = "hello!";
        String hello1 = hello != GOODBYE ? hello : GOODBYE;
        String hello2 = hello1;
        hello2.startsWith(null);
        hello2.toString();
    }

    public static void stringFlowDemo3() {
        String hello = "hello!";
        String hello1 = hello.toString();
        String hello2 = hello1;
        hello2.toString();
    }
}
