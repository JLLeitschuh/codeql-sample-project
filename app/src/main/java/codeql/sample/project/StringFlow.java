package codeql.sample.project;

public class StringFlow {
    public static void stringFlowDemo() {
        String hello = "hello!";
        String hello1 = hello;
    }

    public static void stringFlowDemo2() {
        String hello = "hello!";
        String hello1 = hello != null ? hello : "hello";
    }

    public static void stringFlowDemo3() {
        String hello = "hello!";
        String hello1 = hello.toString();
    }
}
