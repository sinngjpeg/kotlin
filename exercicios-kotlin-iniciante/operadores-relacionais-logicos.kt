

fun main (args: Array<String>) {
    
    /*Relacionais
     *  == (igual a)
     * != (Diferente)
     * > (maior que)
     * < (menor que)
     * >= (maior ou igual)
     * <= (menor ou igual)
     
     * Logicos 
     * && (e)
     * || (ou)
     */ 
    
  /*  var numero = 10
    println(5 == 5)
    println(5 == 6)
    println(5 != 6)
    println(5 != 5)
    println(5 > 5)
    println(5 > 8)
    println(5 >= 8)
    println(5 >= 4)
    println(5 <= 8)
    println(5 <= 2)
    
    var notaAluno = 5
    println (notaAluno >=6)
    
    */
    
    //os valores precisam ser iguais.
    println(true && true)
    // um dos lados precisa ser verdadeiro p/ retornar true, so vai ser false se os dois lados forem falses.
    println(false || true)
    
    //Podemos utilizar Relacionais com Logicos 
    println( 5==5 && 6==6)
    println( 5==5 || 6==5)
    
    var notaProfessor = 7 //0-10
    var notaProvaGeral = 5 //0-10
    println(notaProfessor > 6 && notaProvaGeral >= 5)
    
    
    
}

