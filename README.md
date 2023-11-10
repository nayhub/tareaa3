# tarea3_ExpendedorGUI
Benjamin Jimenez - Antonia Guajardo

Como usar el expendedor:

1) Ver el precio de productos (1 click encima). Si se ve otro producto puedes ver denuevo el precio de este sin que se realize la compra de inmediato
2) ultimaSeleccion el ultimo producto que le viste el precio, sera el considerado "Seleccionado"
3) elegir una moneda, es simplemente darle una vez a una moneda 
4) clickear en la ultimaSeleccion
5) Compra realizada

Errores comunes:

- Si en el paso 4 clickeas otro producto, que no sea el "Seleccionado", se vera como si estuvieras viendo los precios, pero como ya ingresaste una moneda estas obligado a comprar algo con la moneda que ingresate al expendedor
- Si te quedaste sin productos, recargar la maquina es tan facil como darle un click a la ventana de Deposito


Bugs del Branch "Main"
- Bug: Originalmente, en el codigo del Branch main no puede recibir más de una moneda por compra, lo que imposibilita por ejemplo comprar un dulce de $500 con 5 monedas de 100, esto se intento modifcar en el Branch Alternative, pero resultó más dañino al codigo.

Bugs del Branch "Alternative"

- Breaking Bug: La compra se modifico para que se realizara con una moneda especial, que fuera la suma de todas las monedas ingresadas por el usuario.Lamentablemente se creo un bug donde las Excepciones personalizadas no actuaban cuando era necesario, haciendo posible comprar con -1000 pesos.
- Breaking Bug: La compra se modifico para que actuara en el caso de que se quisiera pagar con un numero menor que 0 (exception), pero entonces el codigo empezo a dar resultados incoherentes, un ejemplo es comprar una bebida de $1000 con una moneda de $1500 y recibir 2000 de vuelto.

