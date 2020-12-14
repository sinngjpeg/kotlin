
fun main(args: Array<String>) { 

    //blocos de codigo que executam uma acao 
    
        
    exibirMensagem("Jamilton", 28)
     var resultado  = somar(13,2)
        println(resultado)
    }
    
    ////////////////////parametros
    fun exibirMensagem( nome : String, idade : Int ){
        println("Alerta, voce nao preencheu todos os dados! $nome idade $idade")
    }
    
    fun somar( n1 : Int, n2 : Int) : Int {
        var total = n1 + n2
        return total
        //print(total)
    }