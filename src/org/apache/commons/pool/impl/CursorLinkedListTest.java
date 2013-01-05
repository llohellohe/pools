/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package org.apache.commons.pool.impl;


/**
 * 双向的LinkedList，可以按照游标获得子列表Cursor
 * 
 * @author yangqi 2013-1-5 下午8:59:19
 */
public class CursorLinkedListTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CursorableLinkedList<Integer> list = new CursorableLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.addFirst(3);
        list.addLast(4);

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("====================");
        CursorableLinkedList<Integer>.Cursor cursor = list.cursor(1);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        list.removeLast();

        System.out.println("====================");

        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
