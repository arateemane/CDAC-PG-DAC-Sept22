
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

class zane {
    public static void main(String[] args) {
        // to access the inner class first create object of outer class and then create an object of the inner class
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}