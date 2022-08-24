// this program demonstrate the use of methods and also shows different ways to set values of an object 
// First is Setting the values one by one.
// Second is using a method which sets them.
// Third is using a parameterized constructor.
class EX_03_methods {
    public static void main(String args[]){
        // Box b = new Box(); // non - parameterized constructor
        
        Box b = new Box(10, 20, 15); // parametrized constructor
        // b.width = 10;
        // b.height = 20;
        // b.depth = 15;
        // b.setDim(10, 20, 15);
        b.show();
        double vol = b.volume();
        System.out.println("Volume is "+vol);
    }
}