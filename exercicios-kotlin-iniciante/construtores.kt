class House/*(cor : String, vagasNaGaragem : Int)*/ {
    //Propriedades
    var cor : String = ""
    var vagasNaGaragem : Int = 0 
    
    //construtor secundario
    constructor ( cor: String, vagasNaGaragem : Int) {		
    	this.cor = cor
        this.vagasNaGaragem = vagasNaGaragem
    }
    
    /*
    init {
        this.cor = cor
        this.vagasNaGaragem = vagasNaGaragem
    }
	*/
    
    //Metodos
    
    fun detalhesDaHouse(){
        println("A casa tem cor $cor, vagas: $vagasNaGaragem ")
    }
    fun abrirWindow(qtdWindows : Int){
        println("Abrir janela total $qtdWindows")
    }
    
    fun abrirDoor(){
        println("Abrir porta")
    }
    
    fun abrirHouse(){
        this.abrirDoor()
    }

}

fun main(args: Array<String>) { 

    //constroi o objeto, configuracoes iniiciais
    
 	val house = House("Azul", 5)
    house.detalhesDaHouse()
    

    
    
    
}