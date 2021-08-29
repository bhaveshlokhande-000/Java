class FetchData extends Thread
{
public void run()
{
try
{
System.out.println("data fetching starts....");
Thread.sleep(5000);
}catch(Exception e)
{
System.out.println(e);
}
System.out.println("data fetching end....");
}
}

class ProcessData implements Runnable
{
public void run()
{
try
{
System.out.println("\ndata processing starts....");
Thread.sleep(5000);
}catch(Exception e)
{
System.out.println(e);
}
System.out.println("data processing ends....");
}
}
public class Question3
{
public static void main(String args[]){  
FetchData fd=new FetchData();
Thread pd=new Thread(new ProcessData());
fd.start();
try{
fd.join();  
 }catch(Exception e){System.out.println(e);}  
pd.start(); 
}  
} 