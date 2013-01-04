package test.pool;

public class ParseThings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		long start=System.currentTimeMillis();
		
		int count=1000;
		
		while(count-->0){
			Parser parser=new Parser();
			parser.parse();
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("USE "+(end-start));
	}

}
