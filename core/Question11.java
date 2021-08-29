abstract class FlyingBird
{
public abstract void voice();
public boolean canFly()
{
return true;
}
}

class Sparrow extends FlyingBird
{
public void voice()
{
System.out.println("chirp chirp");
}
}

class Duck extends FlyingBird
{
public void voice()
{
System.out.println("quack quack");
}
}

public class Question11
{
public static void main(String gg[])
{
FlyingBird sparrow=new Sparrow();
sparrow.voice();
System.out.println(sparrow.canFly());
FlyingBird duck=new Duck();
duck.voice();
System.out.println(duck.canFly());
}
}