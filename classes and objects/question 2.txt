import java.util.Scanner;

abstract class name
{
    String First_name ;
    String surname;
    abstract void  get_name(String Fname,String Lname);
    abstract void set_Name();

}
class set_Details extends name
{
    String F_name;
    String L_name;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name ");
        String f_name = sc.nextLine();
        System.out.println("enter the second name ");
        String l_name = sc.nextLine();
        set_Details obj = new set_Details();
        obj.get_name(f_name,l_name);
        obj.set_Name();
    }

    @Override
    void get_name(String Fname, String Lname) {

        this.F_name = Fname;
        this.L_name = Lname;


    }

    @Override
    void set_Name() {
        System.out.println("the first name of the person is : "+F_name);
        System.out.println("the last name of the person is : "+L_name); 
    }
}