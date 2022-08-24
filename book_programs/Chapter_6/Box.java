class Box{
    // member variables
    double width;
    double height;
    double depth;

    public static void main(String args[]){
        
    }
    // parameterized constructor
    Box(double w, double h, double d){
        System.out.println("Constructing Box...");
        width = w;
        height = h;
        depth = d;
    }

    // method which does not returns a value
    void show(){
        System.out.println("Dimension of box are : "+height+" * "+width+" * "+depth);
    }

    // method that returns a value
    double volume(){
        return height*width*depth;
    }

    // method that accepts parameters
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}