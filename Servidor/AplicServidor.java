import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class AplicServidor {
    public static void main(String[] args){
        try{
            Comprador objserv = new Comprador();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/objdist", objserv);
            System.out.println("O objeto foi publicado com sucesso no rmiregistry!");
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
