public class Stack {

    private int arr[];
    private int size;
    private int index = 0;

    //constructer
    public Stack(int size){
        this.size= size;
        arr = new int[size];
    }

// pushing an element
public void push(int element){

    if(isFull()){
        System.out.println("stack is full");
    }else {
        arr[index] = element;
        index++;
    }
}
//popping an element from stack
public int pop(){
    if(isEmpty()){
        System.out.println("Stack is empty");
    }
    return arr[--index];
}
//checking whether stack is empty
public boolean isEmpty(){
    if(index == 0){
        return true;
    }
    return false;
}
//checking whether stack is full
public boolean isFull(){
    if(index==size){
        return true;
    }
    return false;
}
//getting size of stack
public int size(){
    return index;
} }
 class StackClient{
    public static void main(String[]args){
        Stack stack = new Stack(5);
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);

        System.out.println("1.size of stack after push operations :"+stack.size());
        System.out.println("2.pop element from stack :");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());

        }
        System.out.println("\n3. size of stack after pop question :" +stack.size());
    }
}