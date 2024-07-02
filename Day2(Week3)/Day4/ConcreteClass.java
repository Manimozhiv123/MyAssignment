package Week2.Day4;

public  class ConcreteClass implements DatabseConnection {
	
	public void connect() {
		
		System.out.println("Connect");
		
	}
	
	public void disconnect() {
		System.out.println("Disconnect");
		
		
		
	}
	
	
	public void executeUpdate() {
		
		System.out.println("Executeupdate");
	}
	
	public static void main(String[] args) {
		
		ConcreteClass cc = new ConcreteClass();
		 cc.connect();
		 cc.disconnect();
		 cc.executeUpdate();
		
	}

}
