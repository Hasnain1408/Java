public class Multithreading 
{
    public static void main (String[] args)
    {
        // MultithreadThing myThread = new MultithreadThing();
        // MultithreadThing myThread2 = new MultithreadThing();

        // myThread.start();
        // myThread2.start();
        // myThread.run();   //run one by one
        // myThread2.run();

        // for(int i=1; i<=5; ++i)
        // {
        //     MultithreadThing myThread = new MultithreadThing(i);
        //     myThread.start();
        // }
        //   throw new RuntimeException();

        for(int i=1; i<=5; ++i)
        {
            MultithreadThing myThread = new MultithreadThing(i);
            myThread.start();
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {

            }
        }

    }
    
    
}
