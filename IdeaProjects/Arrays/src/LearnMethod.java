public class LearnMethod {
    //method is a block of code which runs when it is called. Mehtod id
    //certain action and they are known as function
    //method 2 types: return type and non return type
    //return method without parameter.
    //return method with parameter;
    //non return without parameter;
    //non return with parameter;

    //method syntax: AccessModifier ReturnType/MethodType MethodName(){
            //}
    //MethodName should be verb+noun


    //Return type method without method
    public int doSummation(){
        int number1=20;
        int number2= 30;
        int sum= number1+number2;
        System.out.println("summation is "+ sum);
        return sum;

    }

    //return type method with parameter
    public int doSubtraction(int num1, int num2){
        int number1=num1;
        int number2= num2;
        int sub= num2-num1;
        System.out.println("subtraction is "+ sub);
        return sub;
    }


    public String stInfo(String fName, String lName, int age) {
        String fullName= fName+" "+ lName;
        System.out.println("full name is "+ fullName+ "age " +age);
        return fullName;

    }

    //non return without parameter

    public void doMultiply(){
        int number1=20;
        int number2= 30;
        int multiply= number1*number2;
        System.out.println("multication is "+ multiply);

    }

    //non return with parameter

    public void doMultiply(int num1, int num2){
        int multiply= num1*num2;
        System.out.println("multication is "+ multiply);

    }

    public void doDivision(double num1, double num2){
        double division=num2/num1;
        System.out.println("division value is "+ division);
    }


    public static void main(String[] args) {
        LearnMethod obj=new LearnMethod();
        obj.doSummation();
        obj.doSubtraction(30,40);
        obj.stInfo("james", "williams", 30);
        obj.doMultiply();
        obj.doMultiply(20,10);
        obj.doDivision(2000,400);

    }
}

