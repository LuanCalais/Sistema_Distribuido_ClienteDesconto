import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.Scanner;

public class Cliente {
    
    public static void main(String[] args){
        try{
        IComprador objcli = (IComprador) Naming.lookup("//localhost/objdist");
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o Id do(a) cliente: ");
        int id = ler.nextInt();

        System.out.println("Entre com o nome do(a) cliente: ");
        String nome = ler.next();

        System.out.println("Entre com o E-mail do(a) cliente: ");
        String email = ler.next();

        System.out.println("Entre com o total da compra: ");
        Double totalCompra = ler.nextDouble();

        objcli.setId(id);
        objcli.setNome(nome);
        objcli.setEmail(email);
        objcli.setTotalcompra(totalCompra);

        objcli.calcularTotalpagar();

        System.out.println("id...................." + objcli.getId());
        System.out.println("Nome.................." + objcli.getNome());
        System.out.println("E-mail................" + objcli.getEmail());
        System.out.println("Total da compra......." + objcli.getTotalcompra());
        System.out.println("Porc Desconto........." + objcli.getPorcentagemdesconto() + "%");
        System.out.println("Total a Pagar........." + objcli.getTotalpagar());

        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
