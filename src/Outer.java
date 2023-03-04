public class Outer {
    public void outerTest(){
        int i,j;
        for(int m=0;m<2;m++) {
            outer:
            for (i = 0; i < 10; i++) {
                for (j = 0; j < 20; j++) {
                    System.out.println(m + ": " + i + " " + j);
                    if (j == 12) {
                        continue outer;
                    }
                }
            }
        }
    }
}
