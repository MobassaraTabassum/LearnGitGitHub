import javax.xml.namespace.QName;

public class LearnConstructor {
   //constructor name is same as class name
    //has no return type
    //constructor are used to initilize the object
    //before creating parameterized constructor we must have to create default
    //constructor
    // default / non parameterized cinstructor
    //parameterized constructor
    String name ;
    String address;
    int age;
    double courseFee;

    public LearnConstructor(){
        System.out.println("this is default constructor");
//default constructor
    }

    //Single parameterized constructor

    public LearnConstructor(String name){
        this.name= name;
        System.out.println(this.name);
        //this. is  a keyword to access the global variable in the class


    }


    //multiple parameterized constructor
    public LearnConstructor(String name, String address){
        this.name=name;
        this.address=address;
        System.out.println(this.name+ " " +this.address);
    }

    public LearnConstructor(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
        System.out.println(this.name+ " " +this.address+ " "+this.age);

    }
    public LearnConstructor(int age, String name, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

//    //pattern should be different string string int

//even if we don't create any default constructor, default constructor is created by jdk
    public static void main(String[]args){
        // constructor are used to initialize the object
        LearnConstructor learn= new LearnConstructor( "james william"); //argument passing
        learn.age=21;
        System.out.println("james age is "+learn.age);

        LearnConstructor arib= new LearnConstructor( "arib","brooklyn"); //argument passing
        arib.courseFee=5000;
        System.out.println("arib course fee is "+ arib.courseFee);

        LearnConstructor dc= new LearnConstructor();
        dc.address= "queens, ny";
        System.out.println(dc.address);
        LearnConstructor raza= new LearnConstructor( "raja", "canada", 35);
        raza.name="syed";
        raza.address="australia";
        raza.courseFee=500.500;
        raza.age=50;
        System.out.println("student name is " +raza.name+ " address " + raza.address + "courseFee "+ raza.courseFee);
    }





}
