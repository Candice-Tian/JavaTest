public class FlowTests {
    public void switchCasePatternUsing(String fruit) {
//        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mango" -> {
                System.out.println("Selected mango");
                System.out.println("Good choice!");
            }
            default -> System.out.println("No fruit selected");
        }
    }
    public void foreachTest(){
        int[] ints={1,2,3,4,5,6};
        for(var item:ints){
            System.out.println(item);
        }
    }
}
