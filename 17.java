//Printing prime numbers between 20 and 100

class prime{
	public static void main(String[] args){
		System.out.println("Prime numbers between 20-100: ");

		for(int i=20; i<=100; i++){
			int count = 0;
			for(int j=2; j<=i; j++){
				if(i%j==0)
					count ++;	
			}
			if(count==1)
				System.out.println(i);
		}
	}
}
