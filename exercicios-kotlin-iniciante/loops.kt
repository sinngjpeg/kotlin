


fun main(args: Array<String>) {
   
    /*
    var numero = 1
    while(numero < 5) {
        // códigos a serem executados
        println("Executado")
        //incrementação 
        numero = numero +1
        
    }
    */
    /*
    for (numero in 1..5) {
        println("Executando: $numero")
    }
    */
    
    var postagens = arrayOf(
    "Descoberto novo método de tratamento de Diabetes!",
        "Novo curso de Android foi lançado!",
        "Bolsa de valores opera em alta de 2%.",
        "Postagem adicionada"
    )
    //para mostrar o indices do array
      
    for((indice, postagens) in postagens.withIndex()) {
        println( "$indice - $postagens" )
   
    //      for(postagens in postagens) {
    //    println( postagens )
        
    }
}