/* 
 Pode se dizer, a grosso modo que uma interface é um contrato que quando assumido
por uma classe deve ser implementado. 
	Interface é utilizada pois podemos ter muitos objetos (classes) que podem possuir a mesma ação 
    (Metodos) porem, podem executa-las de mandeira diferente. */

/*
interface Presidente {
    fun ganharEleicao() 
}

open class Cidadao {
    fun direitosDeveres() {
        println("Todo cidadao tem direitos e deveres")
    }
}

class Obama: Cidadao(), Presidente {
    override fun ganharEleicao(){
        println("Ganhar Eleicao EUA")
    }
    
}

class Jamilton: Cidadao(), Presidente {
     override fun ganharEleicao(){
        println("Ganhar Eleicao no Brasil")
    }
    
}


fun main (args: Array<String>) {
    
    val jamilton = Jamilton()
    jamilton.direitosDeveres()
    
    val obama = Obama()
    obama.direitosDeveres()
    
    
    
}*/