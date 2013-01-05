/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package test.list;

import java.util.LinkedList;

/**
 * 类CursorableLinkedListTest.java的实现描述：TODO 类实现描述 
 * @author yangqi 2013-1-5 下午8:59:19
 */
public class LinkedListTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);

        list.addFirst(3);
        list.addLast(4);

        for (Integer i : list) {
            System.out.println(i);
        }

        list.removeLast();

        System.out.println("====================");

        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
