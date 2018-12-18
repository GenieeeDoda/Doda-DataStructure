package stack;

import java.util.EmptyStackException;

/**
 * Project : Doda-DataStructure
 * Time : 16/12/2018 5:21 PM
 * Created By @hellododa
 */

// 제네릭화 한 Stack 클래스
@SuppressWarnings("unchecked") // 19번째 줄 때문에 써줘야 한다.
public class GenericStack<E> {
    private int top = -1;
    private E[] elements;

    public GenericStack(int initialCapacity){
        this.elements = (E [])new Object[initialCapacity];
        this.top = -1;
    }

    /**
     * 스택의 상단에 데이터를 넣는다.
     * @param item 넣고자 하는 아이템
     * @return
     */
    public E push(E item){
        elements[++top] = item;
        return item;
    }

    /**
     * 스택의 최상단의 데이터를 없앤다.
     * @return 가장 상단에 있던 데이터
     */
    public E pop(){
        if( isEmpty() ){
            throw new EmptyStackException();
        }
        E obj = elements[top];
        elements[top--] = null;

        return obj;
    }

    /**
     * 스택이 비어있는지 확인한다.
     * @return 비어있으면 1, 비어있지 않으면 0
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 최상단 값을 지우지 않고, 최상단의 값을 가져옴.
     * @return 값
     */
    public E peek(){
        if( isEmpty() ){
            throw new EmptyStackException();
        }

        E obj = elements[top];
        return obj;
    }

    /**
     * 아이템의 인덱스를 리턴. Vector의 #lastIndexOf 구현 참고.
     * @param item
     * @return 아이템이 있다면 인덱스, 아이템이 없다면 -1
     */
    public int search(E item){
        if ( item == null ){
            for(int i = this.top ; i >= 0; i--){
                if(elements[i] == null){
                    return i;
                }
            }
        }else{
            for(int i = this.top; i >= 0; i--) {
                if(item.equals(elements[i])){
                    return i;
                }
            }
        }
        return -1;
    }
}
