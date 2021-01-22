package com.clientes;

import com.clases.Clientes;
import com.clases.Empresas;
import com.clases.Mensajes;
import com.clases.Producto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Uso clico do while() para iniciar menu
        @Deprecated(since = "1.2", forRemoval = true)
        Integer opMenu = new Integer(0);
        /**
         * Segun el concepto de polimorfismo un objeto puede tener multiples formas
         * con la estructura de clase que se entrega por favor implementar el concepto de poliformismo
         */
        int n =1;
        int n1 =1;
        int n2 = 1;
        int n3 = 1;
        int n4 = 1;
        int n5 = 1;
        List<Clientes>cliente1 = new ArrayList<>();
        List<Producto>ListaProd1 = new ArrayList<>();
        do try {
            System.out.println(Mensajes.menu);
            opMenu = in.nextInt();
            switch (opMenu.toString()) {
                case "1":
                    do try {
                        System.out.println(Mensajes.cliente);
                        opMenu = in.nextInt();
                        switch (opMenu) {
                            case 1:
                                Producto producto2 = new Producto();
                                Clientes cliente = new Clientes();
                                String nombre, telef, dir,tipodoc,documento,nompro,condic,caract,idprod;
                                System.out.println(Mensajes.nombrecli);
                                    cliente.setNombre(nombre = in.next());
                                System.out.println(Mensajes.telefono);
                                    cliente.setTelefono(telef = in.next());
                                System.out.println(Mensajes.dir);
                                    cliente.setDireccion(dir = in.next());
                                System.out.println(Mensajes.tipodoc);
                                    cliente.setTipDoc(tipodoc = in.next());
                                System.out.println(Mensajes.documento);
                                    cliente.setDocumento(documento = in.next());
                                //Agregamos el producto
                                System.out.println(Mensajes.nombre);
                                producto2.setNombre(nompro = in.next());
                                System.out.println(Mensajes.caractetistica);
                                producto2.setCarateristicas(caract = in.next());
                                System.out.println(Mensajes.idproducto);
                                producto2.setIdProducto(idprod = in.next());
                                System.out.println(Mensajes.condiciones);
                                producto2.setCondiciones(condic = in.next());
                                ListaProd1.add(producto2);
                                cliente.setProductos(ListaProd1);
                                cliente1.add(cliente);
                                break;
                            case 2:
                                n2 = 0;
                                break;
                        }
                    }catch (InputMismatchException e) {
                        System.out.println(Mensajes.error);
                        in.nextLine();
                        n2 = 1;
                    } while (n2 == 1);
                    break;
                case "2":
                    do try{
                        System.out.println(Mensajes.editar);
                        opMenu = in.nextInt();
                        switch (opMenu) {
                            case 1:
                                String nombre, telef, dir,tipodoc,docu,confirma,var;
                                Clientes cliente3 = new Clientes();
                                System.out.println(Mensajes.tipodoc1);
                                    tipodoc = in.next();
                                System.out.println(Mensajes.documento1);
                                    docu =in.next();
                                cliente3.consulta(cliente1,tipodoc,docu);
                                var = cliente3.existe(cliente1,tipodoc,docu);
                                if (var == "1") {
                                    System.out.println(Mensajes.confima);
                                    confirma = in.next();
                                    if (confirma.equals("si")) {
                                        System.out.println(Mensajes.nombrecli);
                                            cliente3.setNombre(nombre = in.next());
                                        System.out.println(Mensajes.telefono);
                                            cliente3.setTelefono(telef = in.next());
                                        System.out.println(Mensajes.dir);
                                            cliente3.setDireccion(dir = in.next());
                                        System.out.println(Mensajes.tipodoc);
                                            cliente3.setTipDoc(tipodoc = in.next());
                                        System.out.println(Mensajes.documento);
                                            cliente3.setDocumento(docu = in.next());
                                        cliente1.add(cliente3);
                                        System.out.println(Mensajes.confirma2);
                                    } else {
                                        n5 = 0;
                                    }
                                }
                                break;
                            case 2:
                                n5 = 0;
                                break;
                        }
                    }catch (InputMismatchException e) {
                        System.out.println(Mensajes.error);
                        in.nextLine();
                        n5 = 1;
                    } while (n5 == 1);
                    break;
                case "3":
                    do try{
                    System.out.println(Mensajes.eliminar);
                    opMenu = in.nextInt();
                        switch (opMenu) {
                            case 1:
                                Clientes cliente3 = new Clientes();
                                String tipoD, doc;
                                System.out.println(Mensajes.tipodoc);
                                    tipoD = in.next();
                                System.out.println(Mensajes.documento);
                                    doc = in.next();
                                //Se llama al metodo para eliminar al cliente
                                cliente3.eliminar(cliente1,tipoD,doc);
                                break;
                            case 2:
                                n4 = 0;
                                break;
                        }
                    }catch (InputMismatchException e) {
                        System.out.println(Mensajes.error);
                        in.nextLine();
                        n4 = 1;
                    } while (n4 == 1);
                    break;
                case "4":
                    do try {
                    System.out.println(Mensajes.producto);
                        opMenu = in.nextInt();
                        switch (opMenu) {
                            case 1:
                            Producto Producto1 = new Producto();
                            String nombre, condiciones,caracteristica,idproducto;
                            System.out.println(Mensajes.nombre);
                                Producto1.setNombre(nombre = in.next());
                            System.out.println(Mensajes.caractetistica);
                                Producto1.setCarateristicas(caracteristica = in.next());
                            System.out.println(Mensajes.idproducto);
                                Producto1.setIdProducto(idproducto = in.next());
                            System.out.println(Mensajes.condiciones);
                                Producto1.setCondiciones(condiciones = in.next());
                            ListaProd1.add(Producto1);
                                break;
                            case 2:
                                n = 0;
                                break;
                        }
                    }catch (InputMismatchException e) {
                        System.out.println(Mensajes.error);
                        in.nextLine();
                        n = 1;
                    } while (n == 1);
                    break;
                case "5":
                    do try {
                        System.out.println(Mensajes.consulta);
                        opMenu = in.nextInt();
                        switch (opMenu) {
                            case 1:
                                Clientes cliente2 = new Clientes();
                                String documento1, tipodoc1, representante;
                                System.out.println(Mensajes.tipodoc);
                                    tipodoc1 = in.next();
                                System.out.println(Mensajes.documento);
                                    documento1= in.next();
                                 //Se llama al metodo para consultar al cliente
                                cliente2.consulta(cliente1,tipodoc1,documento1);
                                break;
                            case 2:
                                n3 = 0;
                                break;
                        }
                    }catch (InputMismatchException e) {
                        System.out.println(Mensajes.error);
                        in.nextLine();
                        n3 = 1;
                    } while (n3 == 1);
                    break;
                case "0":
                    System.out.println(Mensajes.salida);
                    n1 = 0;
                    break;
                default:
                    System.out.println("El valor ingresado no es una opcion de menu");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(Mensajes.error);
            in.nextLine();
            n1 = 1;
        } while (n1 == 1);
        in.close();

    }
}
