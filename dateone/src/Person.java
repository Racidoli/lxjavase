
public class Person
{
    //姓名  实例变量  非静态变量
	private String name;
	//年龄  实例变量  非静态变量
	private int   age;
	
	//城市名称  不仅仅属于哪个个体 ，而是属于所有对象的一个属性
	//属于整个	Person类的
	//静态变量  类变量
	static String  cityName;
	
	//设置值
	public void setAge(int age)
	{
		if(age >0 && age<=300)
		{
			//this表示得是当前对象，谁调用这个方法，this就是谁
			this.age = age;
		}
		else
		{
			System.out.println("您输入的值不合法");
		}
	}
	
	//获取值
	public int getAge()
	{
		if(age>0 && age<=300)
		{
			return this.age;
		}
		else
		{
			return 0;
		}
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	//入口函数
	public static void main(String[] args)
	{
		
		// 对实例变量的访问，就是访问值或是设置值
		// 必须首先创建这个类的对象
		// Person是这个创建对象的模板
		Person p1 = new  Person();
		
		System.out.println(p1.name+","+p1.age);
		
		
		//赋值，设置值
	    p1.name="李鑫";
	    p1.age=20;
	    System.out.println(p1.name+","+p1.age);
	    
	    p1.cityName="南京市";
	    //静态变量也叫类变量，今后采用类名，静态变量名
	    Person.cityName="西安市";
	    
	    cityName="天水市";
	    System.out.println(p1.name+","+p1.age+",城市名为："+p1.cityName);
	
	    
	    Person p2 = new Person();
	    System.out.println(p2.name+","+p2.age+",城市名为："+p2.cityName);
	    
	    
	    //引用类型赋值，实际是把这个对象的地址赋值
	    p2 = p1;
	    System.out.println(p2.name+","+p2.age+",城市名为："+p2.cityName);
	    
	}
	
}
