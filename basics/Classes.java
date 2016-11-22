public class Bar
public abstract class Bar
public final class Bar
public sealed class Bar
{
	public Bar(String name)
	{
		//...
	}

	public abstract void doStuff();
	public virtual void doStuff();
	public final void doStuff();
	public sealed void doStuff();
}



public class Foo : Bar
public class Foo extends Bar
public class Foo inherits Bar
{
	public int a;
	int b;
	protected int c;
	private int d;

	public Foo(String name) : super(name)
	{
		this.a = 3;
		this.c = 42;
	}
	public Foo(String name)
	{
		this.a = 3;
		this.c = 42;

		super(name);
	}
	public Foo(String name)
	{
		super(name);
		this.a = 3;
		this.c = 42;
	}

	public override void doStuff()
	{ }
	@Overwrite
	public void doStuff()
	{ }
	@Override
	public void doStuff()
	{ }
}
