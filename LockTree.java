import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class LockTree 
{
    Node root;
    int depth;
    TheLock lock;
    
    public LockTree(Node root, int depth)
    {
        this.root = root;
        this.depth = depth;
        root.action = "lock";
    }
 
    
  
    public static void main(String[] args)
    {
        
        for (int trial = 0; trial < 5; trial++)
        {
            TheLock lock = new TheLock("Susmita"+ trial, 12);
            lock.resetLock();
            Node root = new Node("lock", null);
            long start = System.nanoTime();
            System.out.println(root.BFS(lock));
            System.out.println(root.DLS(12, lock));
            System.out.println(root.IDS(lock));
            long end = System.nanoTime();
            long diff = end - start;
            System.out.println("Time: " + TimeUnit.NANOSECONDS.toMillis(diff));
         }
         //Lock with unknown length
         Node root = new Node("lock", null);
         TheLock lock = new TheLock("Susmita");
         long start = System.nanoTime();
         //System.out.println(root.IDS(lock));
         long end = System.nanoTime();
         long diff = end - start;
         System.out.println("Time: " + TimeUnit.NANOSECONDS.toMillis(diff));
                
    }
}