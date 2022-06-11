package src.main;

public class TryMulti {
    public TryMulti(){
        // here since we are in same package we can access all classes in MultiClasses.java file.
        MultiClasses m = new MultiClasses();
        Test test = new Test();
        GG gg = new GG();
    }
}
