class EX_02_object_as_param{
    public static void main(String args[]){
        Box box_1 = new Box(10, 30, 15);
        box_1.show();

        Box box_2 = new Box(box_1);
        box_2.show();
    }
}