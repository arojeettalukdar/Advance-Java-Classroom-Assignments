import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {
public Server(){}
public String sayHello(){
return"Hello, world!";
}
public static void main(String args[]){
try{
Server obj = new Server();
Hello stub =(Hello)UnicastRemoteObject.exportObject(obj,13);
 
//Bindthe remote object's stub in the registry
Registry registry =LocateRegistry.getRegistry();
registry.bind("Hello",stub);

System.out.println("Server Ready");
}
catch(Exception e){
System.out.println("Server exception:"+e.toString());
e.printStackTrace();
}
}
}