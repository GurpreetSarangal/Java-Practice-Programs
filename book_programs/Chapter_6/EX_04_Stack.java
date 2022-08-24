class Stack{
    int stck[];
    int tos;
    int size;

    Stack(int size){
        this.size = size;
        stck = new int [size];
        tos = -1;
    }

    void push(int item){
        if(tos == size-1){
            System.out.println("Stack is full!!");
        }
        else {
            stck[++tos] = item;
        }
    }
    int pop(){
        if (tos < 0){
            System.out.println("Stack is empty!!");
            return -1;
        }
        else{
            return stck[tos--];
        }
    }
}

class EX_04_Stack{
    public static void main(String args[]){
        Stack st = new Stack(3);
        for(int i=0; i<=5; i++){
            st.push(i);
        }
        for(int i=0; i<=7; i++){
            System.out.println(st.pop());
        }
    }
}