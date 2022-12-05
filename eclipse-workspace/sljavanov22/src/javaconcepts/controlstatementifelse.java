package javaconcepts;

public class controlstatementifelse {
	int i=43;
	int mul(int x,int y) {
		return x*y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		controlstatementifelse obj = new controlstatementifelse();
		int result = obj.mul(6, 3);
		if(result>27){
System.out.println("output:"+result+"is greater than 12");
	}
		else
		{ System.out.println("condition is not statisfied");

}
}
}