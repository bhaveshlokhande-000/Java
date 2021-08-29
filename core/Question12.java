interface Car
{
public void speed();
}

class BMW implements Car
{
private int speed=250;
public void speed()
{
System.out.println(this.speed+" km/h");
}
}

class Audi implements Car
{
private int speed=200;
public void speed()
{
System.out.println(this.speed+" km/h");
}
}

public class Question12
{
public static void main(String gg[])
{
Car bmw=new BMW();
bmw.speed();
Car audi=new Audi();
audi.speed();
}
}
