class demo
{
     String name;
     int number;

     demo(String name,int number)
     {
         this.name = name;
         this.number = number;
     }

    void display()
    {
        System.out.println(" name entered is : "+name);
        System.out.println("number entered is : "+number);
    }

    public static void main(String[] args) {
        demo d = new demo("ace",321);
        d.display();
    }
}