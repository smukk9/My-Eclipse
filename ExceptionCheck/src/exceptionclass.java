
public class exceptionclass {

	public int foo(int x) {
		// TODO Auto-generated method stubif
		if(x<0){
			throw new NumberFormatException();
			
		}
		return 2;
	}

	public void goo() {
		// TODO Auto-generated method stub
		try{
			int x =foo(-1);
		}
		catch(Exception e)	{
			
			//throw e;
		}
	}
}