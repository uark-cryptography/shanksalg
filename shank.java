class Shank{

	void solve(double a, double b, double p){
		System.out.println("a" + a + " b" + b +" p" + p);
	}

	public static void main(String args[]){
		
		Shank s = new Shank();
		
		//a^x = b mod p
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double p = Integer.parseInt(args[2]);
		
		double n = Math.ceil(Math.sqrt(p));
		
		s.solve(a,b,p);
	}
}