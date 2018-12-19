package stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project : Doda-DataStructure
 * Time : 19/12/2018 11:05 PM
 * Created By @hellododa
 */

public class GenericStackTest {

    @Test
    public void test() {
        GenericStack<Integer> gs = new GenericStack<>(5);

        gs.push(1);
        gs.push(2);
        System.out.println(gs.peek());
        gs.pop();
        gs.push(3);
        gs.push(4);
        System.out.println(gs.search(2));
        System.out.println(gs.search(4));

    }
}