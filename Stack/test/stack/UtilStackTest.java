package stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project : Doda-DataStructure
 * Time : 19/12/2018 11:07 PM
 * Created By @hellododa
 */

public class UtilStackTest {

    @Test
    public void test() {
        UtilStack<Integer> us = new UtilStack<>();

        us.push(1);
        us.push(2);
        System.out.println(us.peek());
        us.pop();
        us.push(3);
        us.push(4);
        System.out.println(us.search(2));
        System.out.println(us.search(4));
    }

}