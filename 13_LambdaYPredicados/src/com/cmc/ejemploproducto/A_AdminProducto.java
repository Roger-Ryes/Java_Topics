package com.cmc.ejemploproducto;

import java.util.ArrayList;
import java.util.List;

public class A_AdminProducto {
    private List<A_Producto> listaProducto;

    public A_AdminProducto(){
        listaProducto = new ArrayList<A_Producto>();
    }

    public void agregarProducto(A_Producto producto){
        listaProducto.add(producto);
    }

    public void mostrarProducto(){
        System.out.println(listaProducto.toString());
    }

    public void cambiarEstado(B_validarEstado validarEstado) {
        for(A_Producto p : listaProducto){
            if(validarEstado.validar(p)){
                p.setEstado(true);
            }
        }
    }
}
