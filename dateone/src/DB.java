
public class DB
{
   
	String host;
	
	String username;
	
	String userpwd;
	
	String url;
	
	//���캯��
	//���캯�������ã������е����Խ��г�ʼ����ֵ
	public DB(String host,String username,String userpwd,String url)
	{
		
		this.host=host;
		this.username=username;
		this.userpwd=userpwd;
		this.url=url;
		
		System.out.println("----�в���");
	}
	
	DB()
	{
		System.out.println("----û�в���");
	}
	
	public static void main(String[] args)
	{
		//���һ�������ж�����캯������ô�͸����������ṩ�˶�����ʻ���
		//������캯���γ�������------>ͬһ������������ͬ����ϣ�������
		DB  db  = new DB("127.0.0.1","student","student","http");
		DB  db1 = new DB();
	}
}
