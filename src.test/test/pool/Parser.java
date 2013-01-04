package test.pool;

import java.util.concurrent.atomic.AtomicInteger;

public class Parser {
	
	private int id;
	
	private static AtomicInteger  createCount=new AtomicInteger(0);
	
	public Parser(){
		id=createCount.incrementAndGet();
		System.out.println("I am a very expensive parser with id "+id);
	}
	
	public void parse(){
		System.out.println(id+" parsing!");
	}
}
