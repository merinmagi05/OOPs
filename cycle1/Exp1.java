public class Exp1
{
	public static void main(String[] args)
	{
		System.out.println("Merin Magi Telson");
		System.out.println("S1MCA");
		System.out.println("Product");
		System.out.println("13/02/2024");
		Product p1=new Product();
		p1.pcode="Car123";
		p1.pname="Benz";
		p1.price=103000;
		System.out.println("*******************Displaying Product1*****************");
		p1.display();
		
		
		Product p2=new Product("Jaguar","Car200",350000);

		System.out.println("*******************Displaying Product2*****************");
		p2.display();
		
		Product p3=new Product("Maruthi","Car245",72600);
		System.out.println("*******************Displaying Product2*****************");
		p3.display();
		Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price <p2.price?p1:p2);
		System.out.println("\n**************Dispalying product with lowest price************");
		p.display();
		
	}
}
