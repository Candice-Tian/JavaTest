public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new ScannerTest().scannerUsing();
        var flowTest=new FlowTests();
        flowTest.switchCasePatternUsing("apple");
        flowTest.foreachTest();
//        new Outer().outerTest();

    }
}