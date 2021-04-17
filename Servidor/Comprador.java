import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Comprador extends UnicastRemoteObject implements IComprador{

    private int id;
    private String nome;
    private String email;
    private double totalCompra;
    private double porcentagemDesconto;
    private double totalPagar;

    public Comprador() throws RemoteException{}

    @Override
    public void setId(int id){
        this.id = id;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String getEmail(){
        return email;
    }

    @Override
    public void setTotalcompra(double totalCompra){
        this.totalCompra = totalCompra;
    }

    @Override
    public double getTotalcompra(){
        return totalCompra;
    }

    @Override
    public double getPorcentagemdesconto(){
        return porcentagemDesconto;
    }

    @Override
    public double getTotalpagar(){
        return totalPagar;
    }

    @Override
    public void calcularPorcentagemdesconto(){
        if(totalCompra >= 0.01 && totalCompra <= 999.99){
            porcentagemDesconto = 0.1;
        }else{
            if(totalCompra >= 1000 && totalCompra <= 4999.99){
                porcentagemDesconto = 0.15;
            }else{
                porcentagemDesconto = 0.2;
            }
        }
    }

    @Override
    public void calcularTotalpagar(){
        calcularPorcentagemdesconto();
        totalPagar = totalCompra - (porcentagemDesconto * totalCompra);
        porcentagemDesconto = porcentagemDesconto * 100;
    }

}