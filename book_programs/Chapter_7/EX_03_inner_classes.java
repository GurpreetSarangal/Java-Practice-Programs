class Outer{
    int outer_x = 100;

    void test(){
        Inner inner =  new Inner();
        inner.display();
    }

    class Inner{
        int y = 10;
        void display(){
            System.out.println("display: outer_x = "+outer_x);
        }
    }
}

class EX_03_inner_classes{
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.test();
    }
}