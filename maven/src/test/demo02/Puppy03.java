
public class Puppy03 {
	int puppyAge;
	public void setAge( int age) {
		puppyAge = age;
		System.out.println("����" + puppyAge);
	}
	
	public static void main(String []args) {
//		��������
		Puppy03 myPuppy = new Puppy03();
		myPuppy.setAge(868);
		System.out.print("����ֵ��" + myPuppy.puppyAge);
//		System.out.println("static�е�" + puppyAge);
	}
}
