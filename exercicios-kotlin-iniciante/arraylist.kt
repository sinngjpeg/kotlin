/*
 	Collections ou coleções -> são implementações de estruturas de dados 
    List
    ArrayList
*/

fun main (args: Array<String>) {

    	//quando voce usa collections list ela nao aceita alterar itens dentro da lista.
    	var listaItens1 = listOf("SP","RJ","MG")
    	println(listaItens1)
    	
    	//array permite alterações
    	var listaItens2 = arrayListOf("SP","RJ","MG")
    	listaItens2.add("BA")
    //	listaItens2.remove("SP")
    //	listaItens.removeAt(0)
    //  listaItens[0] = "MA" < agora o valor de [0] é "MA"
    
    	println(listaItens2.size) // tamanho da lista
    	println(listaItens2.isEmpty()) //se esta vazia ou nao? true = sim false = nao
    	println(listaItens2)
}