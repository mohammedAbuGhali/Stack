
package Chapter4.Stack;

class Node<T>{
     T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next=null;
    }
    
}
public class Stack <T> {
    private Node<T> top;
    private int size;
    public Stack(){
        this.top=null;
       this.size=0;
    }
    public void push(T data){
        Node<T> newNode = new Node(data);
        newNode.next=top;
        top=newNode;
        size++;
    }
    public T pop(){// اصلا بوب بطلع العنصر من الستاك وبترجع البيانات الي فيه 
        if(isEmpty()){
            System.out.println("Stack Is Empty ...! ");
            return null;
        }
            T data=top.data; // اخر عنصر موجود في الستاك اعطيني بياناتو
            top=top.next; // مشيتو خطوة عشان نحذف اخر عنصر موجود في الستاك
            size--; // احذف
            return data; // اعطاني قيمة المحذوف 
    }
    public T beek(){ // وظيفتها انو اعرف التوب شو موجود فيها 
                if(isEmpty()){
            System.out.println("Stack Is Empty ...! ");
           
        }
            T data=top.data; // اخر عنصر موجود في الستاك اعطيني بياناتو
            top=top.next; // مشيتو خطوة عشان نحذف اخر عنصر موجود في الستاك
            size--; // احذف
            return top.data; // اعطاني قيمة المحذوف 
    }
    public boolean isEmpty(){
        return top==null;
    }

    
    
}
