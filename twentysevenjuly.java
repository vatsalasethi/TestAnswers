abstract class arithmetic1{
	int a, b;
	arithmetic1(int a, int b) {
	
		this.a=a;
		this.b=b;
	
	}
	
	public void read() {
		
		System.out.println("Numbers are" + a + " " + b);
	}
	

	abstract int calculate();
		
}

class addition extends arithmetic1 {

	addition(int a, int b)
	{
		super(a,b);
	}
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return this.a+this.b;
	}
  }
			
	
class subtraction extends arithmetic1{
	
	subtraction(int a, int b)
	{
		super(a,b);
	}
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return (this.a-this.b);
	}
	
}

class multiplication extends arithmetic1{
	
	multiplication(int a, int b)
	{
		super(a,b);
	}

	
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return (this.a*this.b);
	}
}


class division extends arithmetic1 {

	division(int a, int b)
	{
		super(a,b);
	}
	
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return (this.a/this.b);
		}	
}

public class twentysevenjuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		arithmetic1 []  ar = {new addition(1,2),new  subtraction(5,1), new multiplication(2,3), new division(6,2)};
				for(int i=0; i<ar.length; i++) {
					System.out.println(ar[i].calculate());
								
				}
	}
}
