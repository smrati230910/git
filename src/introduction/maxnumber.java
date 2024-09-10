package introduction;

public class maxnumber {

	public static void main(String[] args) {
		
		int a[]= {11,4,6,30,10,2,50,37,1,51,10}; 
		int temp=0;
	//int max=a[0];
		
		for(int i=0;i<a.length;i++) {
						
		for(int j=i+1;j<a.length;j++) {
			
			
		if(a[i]>a[j] ||(a[i]==a[j])) {
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;			
		}			
	}
		
		System.out.println(a[i]);
		}


	}
}
