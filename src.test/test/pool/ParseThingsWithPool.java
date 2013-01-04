package test.pool;

import java.util.NoSuchElementException;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.StackObjectPool;

public class ParseThingsWithPool {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws IllegalStateException 
	 * @throws NoSuchElementException 
	 */
	public static void main(String[] args) throws NoSuchElementException, IllegalStateException, Exception {
	
		ObjectPool<Parser>pool=new StackObjectPool<Parser>(new ParserFactory());
		
		for(int i=0;i<=3;i++){
			pool.addObject();
		}
		
		
		long start=System.currentTimeMillis();
		
		int count=1000;
		
		while(count-->0){
			Parser parser=pool.borrowObject();
			
			parser.parse();
			
			pool.returnObject(parser);
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("USE "+(end-start));
	}

}
