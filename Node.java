import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.lang.Math;

public class Node 
{
    Node parent;
    String action;
    
    
    public Node(String action, Node parent)
    {
        this.action = action;
        this.parent = parent;
    }
    
    public ArrayList<String> BFS(TheLock lock)
    {
        lock.resetLock();
        ArrayList <String> key = new ArrayList<String>();
        LinkedList<Node> Q = new LinkedList<Node>();
        Q.add(this);
        int total = 0;    
        while (!Q.isEmpty() && !lock.isUnlocked())
        {
            Node n = Q.remove();
            total += 1;
            
            n.Trial(lock);
            
            if (lock.isUnlocked() == true)
            {
                key = n.trace();
                System.out.println("All Nodes visited: " + total);
                System.out.println("Queue size: " + Q.size());
                return key;
            }
            else
            {
                lock.resetLock();
                Node twist = new Node("1", n);
                Node pull = new Node("2", n);
                Node poke = new Node("3", n);
                Node shake = new Node("4", n);
                Q.add(twist);
                Q.add(pull);
                Q.add(poke);
                Q.add(shake);
                
            }
        }
        return null;
    }
    public ArrayList<String> DLS(int depth, TheLock lock)
    {
        lock.resetLock();
        ArrayList <String> key = new ArrayList<String>();
        LinkedList<Node> S = new LinkedList<Node>();
        S.push(this);
        int total = 0;
        
        while(!S.isEmpty() && !lock.isUnlocked())
        {
            lock.resetLock();
            Node n = S.pop();
            n.Trial(lock);
            total += 1;
            
            key = n.trace();
            
            if(lock.isUnlocked() == true)
            {
                key = n.trace();
                System.out.println("All nodes visited " + total);
                System.out.println("Stack length " + S.size());
                //System.out.println("Depth " + depth);
                return key;
            }
            else
            {
                lock.resetLock();
                if (key.size() < depth)
                {
                    S.push(new Node("1", n));
                    S.push(new Node("2", n));
                    S.push(new Node("3", n));
                    S.push(new Node("4", n));   
                } 
            }
            
        }
        
        return null;
        
    }
    public ArrayList<String> IDS(TheLock lock)
    {
        int depth = 0;
        ArrayList <String> key= null;
        int nodes = 0;
        int length = 0;
        while(!lock.isUnlocked()) 
        {
            key = DLS(depth, lock);
            
            depth++;
            
        }
        System.out.println(depth); 
        while (length < depth-1)
        {
            nodes += Math.pow(4, length);
            
            //System.out.println("Nodes visited at depth " + length + ": " + nodes); 
            length++;   
        }
        
        System.out.println("Nodes visited until " + (length - 1) + ": " + nodes);
        
        return key;  
        
    }
    

   
    public ArrayList <String> trace()
    {
        ArrayList <String> l = new ArrayList<String>();
       
        Node temp = this;
        while(temp.parent != null)
        {
      
            l.add(temp.action);
            temp = temp.parent;
       
        }
        
        return l;
        
       
    }
    public void Trial(TheLock lock)
    {
        ArrayList <String> way = this.trace();
        lock.resetLock();
        for(int i = 0; i < way.size(); i++)
        {
            
            String act = way.get(i);
            if (act.equals("1"))
            {
                lock.twistIt();
            }
            else if (act.equals("2"))
            {
                lock.pullIt();
            }
            else if (act.equals("3"))
            {
                lock.pokeIt();
            }
            else if (act.equals("4"))
            {
                lock.shakeIt();
            }
        }
        
       
    }
}