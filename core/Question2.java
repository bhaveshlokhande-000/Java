class Car
{
private int speed;
public void setSpeed(int speed)
{
this.speed=speed;
}

public int getSpeed()
{
return this.speed;
}
}

class Question2
{
public static void main(String gg[])
{
Car car=new Car();
car.setSpeed(20);
System.out.println("speed is "+car.getSpeed()+" km/h");
}
}