package test.pool;

import java.util.NoSuchElementException;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;

public class ParseThingsWithPool {

    /**
     * @param args
     * @throws Exception
     * @throws IllegalStateException
     * @throws NoSuchElementException
     */
    public static void main(String[] args) throws NoSuchElementException, IllegalStateException, Exception {

        // ObjectPool<Parser>pool=new StackObjectPool<Parser>(new ParserFactory());
        ObjectPool<Parser> pool = new GenericObjectPool<Parser>(new ParserFactory(), 30);

        for (int i = 0; i <= 3; i++) {
            // pool.addObject();
        }

        long start = System.currentTimeMillis();

        int count = 1000;

        while (count-- > 0) {
            new Thread(new ParseTask(pool)).start();
        }

        long end = System.currentTimeMillis();

        System.out.println("USE " + (end - start));
    }

}

class ParseTask implements Runnable {

    private ObjectPool<Parser> pool;

    public ParseTask(ObjectPool<Parser> pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        Parser parser = null;
        try {
            parser = pool.borrowObject();
            System.out.println(Thread.currentThread().getId());
            parser.parse();
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
                pool.returnObject(parser);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
