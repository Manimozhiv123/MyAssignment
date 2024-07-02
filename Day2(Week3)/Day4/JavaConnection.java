package Week2.Day4;

public class JavaConnection  extends MySqlConnection{

	

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate");
		
	}
	

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("executeQuery");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConnection jc =new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();
		

	}

}
