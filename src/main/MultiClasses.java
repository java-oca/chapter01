package src.main;

// only one can be public, should be same as file name
public class MultiClasses {

    public MultiClasses(){
        System.out.println("started");
    }

    void  multiMethod(){
        System.out.println("multi method");
    }
}

// default access modifier is package-private. No keyword needed.
// package-private --> accessible by same package elements only.
class Test {
    Test(){
        System.out.println("Test >>");
    }
}

class GG{
    GG(){
        System.out.println("gg");
    }
}