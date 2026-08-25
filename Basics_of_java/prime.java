public class prime {
   public static void main(String[] args) {
        int no=59,i=2;
		boolean isPrime=true;
		while(i<=Math.sqrt(no)) {
			if(no%i==0) {
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime)
			System.out.println(no+" is Prime");
		else
			System.out.println(no+" is Not Prime");
 
   } 
}
