package com.clases;

import javax.swing.*;
import java.util.List;

public class Empresas {
    private String tipDoc;
    private String documento;
    private String representante;

    public String getTipDoc() {
        return tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getClient(List<Empresas>empresa,String tipo,String doc){
        String cliente = null;
    for (int i=0;i<empresa.size();i++)
        if (empresa.get(i).getTipDoc().equals(tipo)){
           if(empresa.get(i).getDocumento().equals(doc)){
                cliente = empresa.get(i).getRepresentante();
            }
        }
    return cliente;
    }
}
