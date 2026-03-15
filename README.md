# CarritoDeCompras
# CarritoDeCompras

Proyecto Java que implementa un sistema sencillo de carrito de compras.

## Objetivo

Aplicar técnicas de refactorización y buenas prácticas de programación orientada a objetos.

## Refactorizaciones realizadas

- Separación del programa principal y la lógica del carrito.
- Encapsulación mediante atributos privados y getters y setters.
- Validación de precios en el constructor y setters.
- Uso de constantes para valores fijos.
- Manejo de excepciones al eliminar elementos inexistentes.
- Sobrescritura del método toString() para imprimir los items.
- Separación de responsabilidades en métodos.

## Mejoras propuestas

Para mejorar la escalabilidad del programa podría utilizarse una estructura de datos como HashMap<Item, Integer> para almacenar la cantidad de cada producto en el carrito.

## Estructura del proyecto

Main.java  
Item.java  
CarritoDeCompras.java  
