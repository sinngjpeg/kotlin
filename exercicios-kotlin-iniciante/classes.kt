fun main(args: Array<String>) { 

    
    
    val casa = casa()
   casa.cor = "Amarelo"
   casa.abrirJanela()
   casa.abrirCasa
   
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
   
   fun abrirPorta(){
       println("Abrir porta")
   }
   
   fun abrirCasa(){
       this.abrirPorta()
       this.abrirJanela()
   }

}