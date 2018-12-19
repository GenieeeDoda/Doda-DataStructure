package stack;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * Project : Doda-DataStructure
 * Time : 16/12/2018 4:44 PM
 * Created By @hellododa
 */

// Util 클래스 Stack 변형 (Vector 이용)
public class UtilStack<E> {

    private Vector<E> stack;

    /**
     * Creates an empty Stack.
     */
    public UtilStack(){ stack = new Vector<>(); }

    /**
     * 스택의 최상단에 데이터를 넣는다.
     * 다음 함수와 똑같은 결과를 가져온다 : addElement(item) // TODO : vector에서 addElement, add 차이점 알아보기
     *
     * @param item 스택에 최상단에 넣을 데이터
     * @return 매개변수
     * @see     java.util.Vector#addElement
     */
    public E push(E item){
        stack.addElement(item);
        return item;
    }

    /**
     * 스택의 최상단의 데이터를 없애고, 해당 값을 리턴한다.
     *
     * @return 스택의 최상단 데이터 값 (Vector의 가장 마지막 값)
     * @throws EmptyStackException  if this stack is empty.
     */
    public E pop(){
        E obj;
        int len = stack.size();

        obj = peek();
        stack.removeElementAt(len - 1);

        return obj;
    }

    /**
     * 값을 지우지 않은 상태에서 스택의 최상단의 값을 리턴한다.
     *
     * @return  스택의 최상단 데이터 값 (Vector의 가장 마지막 값)
     * @throws  EmptyStackException  if this stack is empty.
     */
    public E peek(){
        int len = stack.size();

        if (len == 0){
            throw new EmptyStackException();
        }
        return stack.elementAt(len - 1);
    }

    /**
     * 스택이 비어있는지 아닌 지 확인
     *
     * @return 비어있다면 true, 비어있지 않다면 false
     */
    public boolean empty(){
        return stack.size() == 0;
    }

    /**
     * 전달받은 객체를 찾아 객체의 인덱스를 리턴한다.
     * 단, 인덱스는 스택의 상단에서 부터 계산하고, 1부터 시작이다.
     * 예를 들어 [ 1 3 4 5 ] 가 있을 경우, 5는 1, 1은 4의 위치에 존재한다.
     *
     * @param   o   찾고자 하는 요소
     * @return  스택에 없다면 -1을, 스택에 있다면 요소의 위치를 리턴한다.
     */
    public int search(Object o){
        int i = stack.lastIndexOf(o);

        if (i >= 0) {
            return stack.size() - i; // 앞에서 읽는 기준이 아닌, 뒤에서 읽는 기준이므로 size() - i를 해준다.
        }
        return -1;
    }
}
