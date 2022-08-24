class Outer{
    int outer_x = 100;

    void test(){
        for(int i=0; i<10; i++){
            class Inner{
                void display(){
                    System.out.println("display: outer_x = "+outer_x);
                }
            }
            Inner inner =  new Inner();
            inner.display();
        }
    }

}

class EX_04_inner_classes_in_for_loop{
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.test();
    }
}