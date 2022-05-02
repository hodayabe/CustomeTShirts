package customeTShirts;

public class Runner {

	public static void main(String[] args) {
		
		Color c=new Color(); 
		Design d =new Design(25, 20, "Hodaya", c, 40);
		Design d1 =new Design();
		Tshirt [] t =new Tshirt[3];
		t[0]=new Tshirt();
		t[1]=new Tshirt(Size.M,d,0.5);
		t[2]=new Tshirt(Size.L,d1,0.6);
		
		System.out.println("t1");
		System.out.println(t[0]);
		System.out.println("t2");
		System.out.println(t[0]);
		System.out.println("t3");
		System.out.println(t[0]);
		
		
		
		
		
	}
	

}
