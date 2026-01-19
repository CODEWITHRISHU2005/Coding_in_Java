sealed interface X permits Y {

}

non-sealed interface Y extends X {

}

/*
-> Sealed class basically give permission to sub-classes for inheriting sealed class.
-> Those sub-class which inherit sealed class must be sealed or non-sealed or final class.
-> Those sub-interface which inherit sealed interface must be sealed or non-sealed.
-> Interface cannot be final because if we try to make interface as final we are stopping
   inheritance and we know inside interface only abstract methods are define and we have to
   implement abstract methods in concrete class by using inheritance concept.
*/
sealed class A permits B, C {

}

non-sealed class B extends A {
}

final class C extends A {

}

class D extends B {

}

public class Sealed {
    public static void main(String[] args) {
    }
}
