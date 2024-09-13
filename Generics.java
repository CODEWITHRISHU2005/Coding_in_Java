/*
=> Java Generics:-
-> Introduced from JDK 5.0 onwards.
-> The Java Generics helps us to deal with the  compiler time type-safety.
-> With the help of the Generics, we can write a single method and call it with different argument types(integer, strings, etc.).

=> Advantages of Generics:-
-> Bugs can be detected at compile-time:
-> While developing any application or program, it is always better to catch the bug/problem at the compile-time instead of  runtime so that we can provide a smooth experience to the user.
*/
import java.util.ArrayList;
import java.util.List;

class Generic<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public Generic(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class Generics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(54);
        arrayList.add(643);
//      ArrayList<int> arrayList = new ArrayList();-> this will produce an error
//      arrayList.add("str1");
//      int a = (int) arrayList.get(0);
//      System.out.println(a);

        Generic<String, Integer> g1 = new Generic(23, "Rishabh Gupta: ", 61);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}