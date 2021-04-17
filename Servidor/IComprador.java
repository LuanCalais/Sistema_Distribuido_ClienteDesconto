import java.rmi.*;
import java.net.*;

public interface IComprador extends Remote{
    public void setId(int id) throws RemoteException;
    public int getId() throws RemoteException;
    public void setNome(String nome) throws RemoteException;
    public String getNome() throws RemoteException;
    public void setEmail(String email) throws RemoteException;
    public String getEmail() throws RemoteException;
    public void setTotalcompra(double totalCompra) throws RemoteException;
    public double getTotalcompra() throws RemoteException;
    public double getPorcentagemdesconto() throws RemoteException;
    public double getTotalpagar() throws RemoteException;
    public void calcularPorcentagemdesconto() throws RemoteException;
    public void calcularTotalpagar() throws RemoteException;
}
