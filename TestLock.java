public class TestLock
{
    public static void main(String[] args)
    {
        TheLock lock = new TheLock("Susmita", 1);
        lock.twistIt();
        System.out.println(lock.isUnlocked());
        lock.resetLock();
        lock.pokeIt();
        System.out.println(lock.isUnlocked());
        lock.resetLock();
        lock.pullIt();
        System.out.println(lock.isUnlocked());
        lock.resetLock();
        lock.shakeIt();
        System.out.println(lock.isUnlocked());
        lock.resetLock();
        
        TheLock lock2 = new TheLock("Susmita", 2);
        lock2.twistIt();
        lock2.pokeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.twistIt();
        lock2.pullIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.twistIt();
        lock2.twistIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.twistIt();
        lock2.shakeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pokeIt();
        lock2.twistIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pokeIt();
        lock2.pokeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pokeIt();
        lock2.shakeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pokeIt();
        lock2.pullIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pullIt();
        lock2.shakeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pullIt();
        lock2.pokeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pullIt();
        lock2.pullIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.pullIt();
        lock2.twistIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.shakeIt();
        lock2.shakeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.shakeIt();
        lock2.pokeIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.shakeIt();
        lock2.pullIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.shakeIt();
        lock2.twistIt();
        //System.out.println(lock2.isUnlocked());
        lock2.resetLock();
        lock2.twistIt();
        lock2.shakeIt();
        
        
      
        
    }
    
    
}