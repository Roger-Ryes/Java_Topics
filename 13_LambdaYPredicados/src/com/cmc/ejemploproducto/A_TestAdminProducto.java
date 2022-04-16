package com.cmc.ejemploproducto;

import java.time.LocalDate;
import java.time.Month;

public class A_TestAdminProducto {
    public static void main(String[] args) {
        A_AdminProducto adminProducto = new A_AdminProducto();

        adminProducto.agregarProducto(new A_Producto("papas", 2, 10, LocalDate.of(2024, Month.APRIL, 05)));
        adminProducto.agregarProducto(new A_Producto("Sodas", 10, 50, LocalDate.of(2023, Month.AUGUST, 10)));
        adminProducto.agregarProducto(new A_Producto("Jabon", 1, 20, LocalDate.of(2022, Month.FEBRUARY, 20)));

        adminProducto.mostrarProducto();
        adminProducto.cambiarEstado( (producto)-> producto.getFechaCaduca().isAfter(LocalDate.of(2023, Month.MAY, 2)) );
        adminProducto.cambiarEstado( (producto)-> producto.getStock()<15 );
        adminProducto.mostrarProducto();
    }
}
