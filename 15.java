class table2{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			System.out.print("\n");
			for(int j=1;j<=10;j++){
				if(j==7){
					continue;
				}
				System.out.println(+i+" X "+j+" = "+i*j);

			}

		}
	}
}
