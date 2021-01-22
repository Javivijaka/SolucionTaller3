package com.clases;

import java.util.List;

public class Clientes {
    private String nombre;
    private String telefono;
    private String direccion;
    private String tipDoc;
    private String documento;
    private List<Producto> productos;

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getTipDoc() { return tipDoc; }

    public void setTipDoc(String tipDoc) { this.tipDoc = tipDoc; }

    public String getDocumento() { return documento; }

    public void setDocumento(String documento) { this.documento = documento; }

    public void consulta(List<Clientes>lista1,String tipodoc, String doc){
        for (int i=0;i< lista1.size();i++)
            if (lista1.get(i).getTipDoc().equals(tipodoc)){
                if(lista1.get(i).getDocumento().equals(doc))
            System.out.println(lista1.get(i));
            }else{
            System.out.println(Mensajes.error1);
            }
    }

    public void eliminar(List<Clientes>lista1,String tipodoc, String doc){
        for (int i=0;i< lista1.size();i++)
            if (lista1.get(i).getTipDoc().equals(tipodoc)){
                if(lista1.get(i).getDocumento().equals(doc))
                lista1.remove(i);
            }else{
                System.out.println(Mensajes.error1);
            }
    }

    public String existe(List<Clientes>lista1,String tipodoc, String doc){
        String var = null;
        for (int i=0;i< lista1.size();i++)
            if (lista1.get(i).getTipDoc().equals(tipodoc)){
                if(lista1.get(i).getDocumento().equals(doc))
                    var = "1";
            }
        return var;
    }


    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipDoc='" + tipDoc + '\'' +
                ", documento='" + documento + '\'' +
                ", productos=" + productos +
                '}';
    }
}
