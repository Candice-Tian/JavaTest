import java.util.Arrays;

public class ArrayListTest {
    public void printArrayList(){
        int[] intList={1,2,3,4,5};
        for(var item:intList){
            System.out.print(item+" ");
        }
        System.out.println();
        // 倒序打印数组元素:
        for (int i=intList.length-1;i>=0;i--) {
            System.out.println(intList[i]);
        }

       System.out.println(Arrays.toString(intList));
    }

    public  void maoPaoSort(){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for(int i=0;i < ns.length;i++){
            for(int j=0;j<ns.length-i-1;j++){
                if(ns[j]>ns[j+1]){
                    var temp=ns[j];
                    ns[j]=ns[j+1];
                    ns[j+1]=temp;
                }
            }
        }
        Arrays.sort(ns); //排序
        System.out.println(Arrays.toString(ns));
    }
}
