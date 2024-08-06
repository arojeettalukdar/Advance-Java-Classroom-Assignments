import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Client{
	private Client(){}
	public static void main(String args[]){
	String host = (args.length<1)?null:args[0];
	try{
	Registry registry = LocateRegistry .getRegistry(host);
	Hello stub =(Hello)registry.lookup("Hello");
	String response = stub.sayHello();
	System.out.println("response: "+response);
	}
	catch(Exception e) {
	System.out.println("Client exception: " + e.toString());
	e.printStackTrace();
	}
	}
}