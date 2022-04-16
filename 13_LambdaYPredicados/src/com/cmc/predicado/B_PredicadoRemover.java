package com.cmc.predicado;

import com.cmc.ejemploproducto.A_Producto;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class B_PredicadoRemover {
    public static void main(String[] args) {
        List<A_Producto> productos = new ArrayList<>();

        productos.add(new A_Producto("papas", 2, 10, LocalDate.of(2024, Month.APRIL, 05)));
        productos.add(new A_Producto("Sodas", 10, 50, LocalDate.of(2023, Month.AUGUST, 10)));
        productos.add(new A_Producto("Jabon", 1, 20, LocalDate.of(2022, Month.FEBRUARY, 20)));

        // removeIf() -- funcion de predicado
        System.out.println(productos);
        productos.removeIf((p)->{
            return p.getStock()<30;
        });
        System.out.println(productos);
    }
}
