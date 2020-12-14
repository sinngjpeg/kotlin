open class Animal{
    open fun dormir(){
        println("Dormir")
    }
    
    fun comer(){
        println("Comer")
    }
}


class Cao : Animal(){
    override fun dormir(){
        println("Dormir como um cao")  
}
    
} 
fun main(args: Array<String>) { 
	
    val cao = Cao()
	cao.dormir()

 }