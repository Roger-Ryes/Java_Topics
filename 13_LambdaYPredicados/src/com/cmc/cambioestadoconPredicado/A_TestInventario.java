package com.cmc.cambioestadoconPredicado;

import com.cmc.ejemploproducto.A_Producto;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class A_TestInventario {
    public static void main(String[] args) {

        List<A_Producto> productos = new ArrayList<>();

        productos.add(new A_Producto("papas", 2, 10, LocalDate.of(2024, Month.APRIL, 05)));
        productos.add(new A_Producto("Sodas", 10, 50, LocalDate.of(2023, Month.AUGUST, 10)));
        productos.add(new A_Producto("Jabon", 1, 20, LocalDate.of(2022, Month.FEBRUARY, 20)));

        System.out.println(productos);
        A_Inventario.modificar(productos, (p)->p.getPrecio()>5 );
        System.out.println(productos);
    }
}
