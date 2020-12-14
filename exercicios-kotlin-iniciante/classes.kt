fun main(args: Array<String>) { 

    
    
    val casa = casa()
   casa.cor = "Amarelo"
   casa.abrirJanela()
   
   val casa2 = casa()
   casa.cor = "Violeta"
   
   
   
}

class casa {
   //Propriedades
   var cor : String = ""
   
   //Metodos
   fun abrirJanela(){
       println("Abrir janela")
   }

}