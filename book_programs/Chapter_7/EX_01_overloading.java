class Overloaded{
    void test(){
        System.out.println("No parameters!!");
    }
    
    void test(int i){
        System.out.println("value of integer: "+i);
    }

    void test(int a, int b){
        System.out.println("Two integers are : "+a+"  "+b);
    }

    void test(double d){
        System.out.println("Double value is: "+d);
    }
}
class EX_01_overloading {
    public static void main(String args[]){
        Overloaded ob = new Overloaded();
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(342.242);
    }
}