package trab1;

import java.net.InetAddress;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IContactServer extends Remote {
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	public String[] listServers(String userName) throws RemoteException;
	
	/**
	 * 
	 * @param serverName
	 * @param serverIP
	 * @param userName
	 */
	public void registerServer(String serverName, InetAddress serverIP, String userName) throws RemoteException;
	
	/**
	 * 
	 * @return
	 */
	public boolean addPermission(String server, String userName) throws RemoteException; 
	
	/**
	 * 
	 * @param server
	 * @param user
	 * @return
	 * @throws RemoteException
	 */
	public boolean remPermission( String server, String user) throws RemoteException;
	
	public String[] dir( String server, String user, String dir) throws InfoNotFoundException, RemoteException;

}
