package com.cmc.cambioestadoconPredicado;

import com.cmc.ejemploproducto.A_Producto;

import java.util.List;
import java.util.function.Predicate;

public class A_Inventario {
    public static void modificar(List<A_Producto> productos, Predicate<A_Producto> condicion){
        for(A_Producto p : productos){
            if(condicion.test(p)){
                p.setEstado(true);
            }
        }
    }
}
