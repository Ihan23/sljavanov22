package slphase1;
import java.swing.palf.multi.multibuttonUI;

public class controlstatementifelse {
	
	
	
	int i=48;
	
	int mul (int a,int b)
	{
		return a*b;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			controlstatementifelse obj = new controlstatementifelse();
			int result = obj.mul(6, 3);
			if (result>27) {
				
	       System.out.println("output:"+result +"is greatan than 12 ");
			}else
			{
	       System.out.println("condition is not statisfied");
	       
		}

	}

}
