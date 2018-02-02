import java.util.*;

class Shank{

	void solve(double a, double b, double p){
		//System.out.println("a" + a + " b" + b +" p" 	+ p);
		
		
	}

	public static void main(String args[]){
		
		if(args.length != 3){
			System.out.println("Invalid usage - java shank <a> <b> <p>");
			System.exit(0);
		}
		
		Shank s = new Shank();
		
		//a^x = b mod p
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double p = Double.parseDouble(args[2]);
		
		double n = Math.ceil(Math.sqrt(p));
		//System.out.println("n " + n);
		
		ArrayList<Double> list1 = new ArrayList<>();
		ArrayList<Double> list2 = new ArrayList<>();
		
		for(int i = 0; i < n; i++){
			list1.add(Math.pow(a,i)%p);
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(list1);
		}
		
		s.solve(a,b,p);
	}
}