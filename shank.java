import java.util.*;
import java.math.BigInteger;

class Shank{
		
	ArrayList<BigInteger> list1 = new ArrayList<>();
	ArrayList<BigInteger> list2 = new ArrayList<>();


	BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = n.shiftRight(5).add(BigInteger.valueOf(8));
		while (b.compareTo(a) >= 0) {
			BigInteger mid = a.add(b).shiftRight(1);
			if (mid.multiply(mid).compareTo(n) > 0) {
				b = mid.subtract(BigInteger.ONE);
			} else {
				a = mid.add(BigInteger.ONE);
			}
		}
		return a.subtract(BigInteger.ONE);
	}
	//JochemKuijpers/BigInteger_sqrt.java

	void solve(BigInteger a, BigInteger b, BigInteger p, BigInteger n){
		
		BigInteger tmp = new BigInteger();
		
		//List1   e, g, g2, g3, . . . , gn  
		for(BigInteger i = n; i.compareTo(BigInteger.ZERO) > 0; i = i.subtract(BigInteger.ONE)){
			list1.add(a.modPow(i,p));
			list2.add(b.multiply(a.modPow(n.multiply(i),p)));
		}		
		System.out.println(list1);
		System.out.println(list2);
		
		/*
		
		for(tmp : list1){
			if(list2.contains(tmp)){
				System.out.println("found");
			}
		}
		
		
		for(int i = n.intValue(); i > 0; i--){
			for(int j = n.intValue(); j > 0; j--){
				if(list1[i].equals(list2[j])){
					System.out.println("found");
				}
			}
		}
		
		for(BigInteger i = n; i.compareTo(BigInteger.ZERO) > 0; i = i.subtract(BigInteger.ONE)){
			for(BigInteger j = n; j.compareTo(BigInteger.ZERO) > 0; j = j.subtract(BigInteger.ONE)){
				if (list1[i] == list2[j])
					System.out.println("x=");
			}
		}*/
		
		//TODO: List2 h*g^(-in) mod p		
		//TODO: compare both lists for match
		//TODO: x = list1 + list2*n
		
	}

	public static void main(String args[]){
		
		if(args.length != 3){
			System.out.println("Invalid usage - java shank <a> <b> <p>");
			System.exit(0);
		}
		
		Shank s = new Shank();
		
		//a^x = b mod p
		BigInteger a = new BigInteger(args[0]);
		BigInteger b = new BigInteger(args[1]);
		BigInteger p = new BigInteger(args[2]);
		
		BigInteger n = s.sqrt(p);
		//System.out.println("n " + n);	
		
		s.solve(a,b,p,n);
	}
}