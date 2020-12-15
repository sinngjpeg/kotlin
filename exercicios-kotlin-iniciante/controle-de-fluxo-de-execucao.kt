


fun main(args: Array<String>) {
    
    
    /* Controle de fluxo de execução 
     if (CONDICAO) {
       caso a condição seja satisfeita
     }
    */
    
    /*
    if(true) {
        println("verdadeiro")               
        
    }
    
    if(5==6) {
        println("verdadeiro")               
        
    } else{
        
        print("falso")
    }
    */
    //if condição, else if segunda codição, else se nao for nenhuma das duas primeiras opções o else resolve.
    
    /*
    var idade = 18 
    if ( idade < 14) {
        println("Criança")
        
    } else if (idade >= 14 && idade < 18 ){
    println("Adolescente")
	} else {
    println("Adulto")
		}
        */

   /* var media = 5
    if ( media >= 6) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
    */
    
    //Pode ser feito assim tambem: 
    
    var media = 8
    var resultado = if (media >= 6) "Aprovado" else "Reprovado"
    println( resultado )
    
}