class outer
{
    void test()
    {
        System.out.println("sucess");
    }
    static class inner{

        void test1()
        {
            outer out = new outer();//object of outer class created
            out.test();//calling test function from outer class
        }
    }

    public static void main(String[] args) {
        outer.inner obj = new outer.inner(); // inner class object created
        obj.test1(); // calling test1 of inner class 
    }

}