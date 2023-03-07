public class GenericUsage {
    public void useGenericClass(){
        var pair= new Pair<>("ka", "peng");
        var pair2=new Pair<>(1,2);
        var p1=pair.getClass();
        var p2=pair2.getClass();
        System.out.println(p1==p2); // always return true

       var result= addMethod(pair2);
    }

    private int addMethod(Pair<? extends Number> p){
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }

    void setMethod(Pair<? super Integer> p, Integer first, Integer last) {
        p.setFirst(first);
        p.setLast(last);
    }

}
