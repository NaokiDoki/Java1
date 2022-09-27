//printing multiplication table till 10 and skipping all colum having number 7 using concept of break or continue

class table2{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			System.out.print("\n");
			for(int j=1;j<=10;j++){
				if(j==7){
					continue;
				}
				System.out.println(+i+" x "+j+" = "+i*j);

			}

		}
	}
}
