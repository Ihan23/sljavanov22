package javaconcepts;

public class csifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks =78;
if(marks<80) {
	System.out.println("grad A");
}else if(marks<60){
	System.out.println("fail");
}
else if(marks<60&&marks>70){
	System.out.println("grade c");
}
else if(marks<70&&marks>80){
	System.out.println("grade b");
}
	else {
		System.out.println("fail");
	}

}

	}


