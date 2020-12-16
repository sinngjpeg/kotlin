/* 
 * 	Enum (Enumeração) -> é um tipo de dados que consiste em um conjutno de constantes. */

enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido {
    
    var status: StatusPedido = StatusPedido.PROCESSANDO 
    
}

fun main (args: Array<String>) {
    
    val pedido = Pedido()
    pedido.status = StatusPedido.APROVADO 
    
    if ( pedido.status == StatusPedido.PROCESSANDO ) {
        println("Pedido está sendo processado!")                  
    } else if (pedido.status == StatusPedido.APROVADO){
        println("Pedido está aprovado!")    
    } else if (pedido.status == StatusPedido.REPROVADO){
        println("Pedido está reprovado!")   
    }   
}