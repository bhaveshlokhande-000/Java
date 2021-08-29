class Message
{
private String text;
public boolean isEmpty=true;
synchronized public void write(String text)
{
while(this.isEmpty==false)
{
try
{
wait();
}catch(Exception e)
{
System.out.println(e);
}
}
this.text=text;
this.isEmpty=false;
notify();
}

synchronized public String read()
{
while(this.isEmpty==true)
{
try
{
wait();
}catch(Exception e)
{
System.out.println(e);
}
}
this.isEmpty=true;
notify();
return this.text;
}

}

class Writer extends Thread
{
Message message;
Writer(Message message)
{
this.message=message;
}

public void run()
{
String[] msgs=new String[]{"HI","HOW ARE YOU","BYE"};
for(int i=0;i<3;i++)
{
System.out.println("message write: "+msgs[i]);
message.write(msgs[i]);
try
{
Thread.sleep(100);
}catch(Exception e)
{
System.out.println(e);
}
}
}
}

class Reader extends Thread
{
Message message;
Reader(Message message)
{
this.message=message;
}

public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("message read: "+message.read());
}
}
}

public class Question4
{
public static void main(String gg[])
{
Message m=new Message();
Writer w=new Writer(m);
Reader r=new Reader(m);
w.start();
r.start();
}
}

