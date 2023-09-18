class Visa(override val CardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if(age>60){
            println("Negativo")
        }
        else{
            println("Positivo")
        }
    }
}