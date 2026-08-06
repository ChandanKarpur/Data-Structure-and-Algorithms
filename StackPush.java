public class StackPush {
    int arr[];
    int size;
    int top=-1;
    StackPush(int size){
        this.size=size;
        arr=new int[size];
        System.out.println("Stack is created with size: "+size);
    }
    public int push(int n){
        if(top==size-1){
            System.out.println("Stack is full");
            return -1;
        }
        top++;
        arr[top]=n;
        System.out.println(n);
        return -1;
    }
    public static void main(String[] args) {
        StackPush stack = new StackPush(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
    }
}
