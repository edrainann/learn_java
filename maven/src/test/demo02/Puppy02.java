
public class Puppy02{
	int puppyAge;
	public Puppy02(String name){
		// �������������һ��������name
		System.out.println("С���������� : " + name ); 
		}
	 
	public void setAge( int age ){
	   puppyAge = age;
	   }
	 
	public int getAge( ){
		System.out.println("С��������Ϊ : " + puppyAge ); 
		return puppyAge;
	   }
	 
	public static void main(String []args){
		/* �������� */
		Puppy02 myPuppy = new Puppy02( "������" );
		/* ͨ���������趨age */
		myPuppy.setAge( 88 );
	    /* ������һ��������ȡage */
		myPuppy.getAge( );
	    /*��Ҳ�����������������ʳ�Ա���� */
//	    System.out.println("����ֵ : " + myPuppy.puppyAge ); 
	   }
	
	}