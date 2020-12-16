/*
  	Set -> nao permite elementos duplicados, é mais rapido que o ArrayList,
    nao mantem a ordem dos elementos 
    Map -> é uma implementação chave/valor
*/

fun main(args: Array<String>) {
    /*
    //var itens = hashSetOf("a","b","c","c")
      var itens = hashSetOf("10","20","30","70")
    for ( item in itens) {
        println(item)
    }
    */
    
    var map = hashMapOf(
    	"urso" to "Animal que hiberna",
    	"cao"  to "Melhor amigo do homem"
    )
    map.put("passaro","Gosta de voar")
    //map.remove("passaro") remove o passaro 
    //for ( item in map.keys) exibe apenas a chave
    //for ( item in map.values) exibe apenas os valores 
    
    for ( item in map) {
        println(item)
    }
}