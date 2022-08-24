/**
    Demonstrate the Assigning Object Reference Variables
*/
class EX_02_object_reference_variables{
    public static void main(String args[]){
        // here b1 and b2 points to same location in memory
        Box b1 = new Box();
        Box b2 = b1;

        b1.width = 10;
        b1.height = 20;
        b1.depth = 30;
        
        System.out.println("width "+b2.width);
        b2.width = 15;
        
        System.out.println("width "+b1.width);
    }
}