
public class DB
{
   
	String host;
	
	String username;
	
	String userpwd;
	
	String url;
	
	//构造函数
	//构造函数的作用：给类中的属性进行初始化赋值
	public DB(String host,String username,String userpwd,String url)
	{
		
		this.host=host;
		this.username=username;
		this.userpwd=userpwd;
		this.url=url;
		
		System.out.println("----有参数");
	}
	
	DB()
	{
		System.out.println("----没有参数");
	}
	
	public static void main(String[] args)
	{
		//如果一个类中有多个构造函数，那么就给创建对象提供了多个访问机制
		//多个构造函数形成了重载------>同一个方法名，不同的是希望结果。
		DB  db  = new DB("127.0.0.1","student","student","http");
		DB  db1 = new DB();
	}
}
