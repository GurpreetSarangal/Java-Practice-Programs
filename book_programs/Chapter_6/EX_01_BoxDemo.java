/** 
    Demonstrate the use of multiple classes in a single program    
*/

class Box{
    double width;
    double height;
    double depth;
}
class EX_01_BoxDemo{
    public static void main(String args[]){
        Box mybox_1 = new Box();
        Box mybox_2 = new Box();
        double vol_1, vol_2;

        // assign values to mybox_1's instance variables
        mybox_1.width = 10;
        mybox_1.height = 20;
        mybox_1.depth = 15;
        
        // assign values to mybox_2's instance variables
        mybox_2.width = 2;
        mybox_2.height = 4;
        mybox_2.depth = 5;

        // compute volume of box-1
        vol_1 = mybox_1.width * mybox_1.height * mybox_1.depth;

        // compute volume of box-2
        vol_2 = mybox_2.width * mybox_2.height * mybox_2.depth;

        System.out.println("Volume of box 1 is " +vol_1);
        System.out.println("Volume of box 2 is " +vol_2);
    }
}