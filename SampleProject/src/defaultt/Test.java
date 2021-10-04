package defaultt;

public class Test {
	
	
	public static int div(int a, int b) {
		int c=0;
		try {
			String s=null;
			s.charAt(0);
			return c;
			
		//	return c=a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Hii");
		}
		return 0;	
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	try {
			int a=10;
			int b =0;
			
			int c = a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); */
		
		int res=div(10,0);
		System.out.println(res);
		}
}