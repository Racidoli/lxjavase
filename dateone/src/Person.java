
public class Person
{
    //����  ʵ������  �Ǿ�̬����
	private String name;
	//����  ʵ������  �Ǿ�̬����
	private int   age;
	
	//��������  �����������ĸ����� �������������ж����һ������
	//��������	Person���
	//��̬����  �����
	static String  cityName;
	
	//����ֵ
	public void setAge(int age)
	{
		if(age >0 && age<=300)
		{
			//this��ʾ���ǵ�ǰ����˭�������������this����˭
			this.age = age;
		}
		else
		{
			System.out.println("�������ֵ���Ϸ�");
		}
	}
	
	//��ȡֵ
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
	
	//��ں���
	public static void main(String[] args)
	{
		
		// ��ʵ�������ķ��ʣ����Ƿ���ֵ��������ֵ
		// �������ȴ��������Ķ���
		// Person��������������ģ��
		Person p1 = new  Person();
		
		System.out.println(p1.name+","+p1.age);
		
		
		//��ֵ������ֵ
	    p1.name="����";
	    p1.age=20;
	    System.out.println(p1.name+","+p1.age);
	    
	    p1.cityName="�Ͼ���";
	    //��̬����Ҳ�����������������������̬������
	    Person.cityName="������";
	    
	    cityName="��ˮ��";
	    System.out.println(p1.name+","+p1.age+",������Ϊ��"+p1.cityName);
	
	    
	    Person p2 = new Person();
	    System.out.println(p2.name+","+p2.age+",������Ϊ��"+p2.cityName);
	    
	    
	    //�������͸�ֵ��ʵ���ǰ��������ĵ�ַ��ֵ
	    p2 = p1;
	    System.out.println(p2.name+","+p2.age+",������Ϊ��"+p2.cityName);
	    
	}
	
}
