package test.pool;

import org.apache.commons.pool.BasePoolableObjectFactory;

public class ParserFactory extends BasePoolableObjectFactory<Parser>{

	@Override
	public Parser makeObject() throws Exception {
		return new Parser();
	}

	
}
