class MasterCard(override val CardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if(age>50) {
            println("Negativo")
        }

        else {
            println("Positivo")
        }
    }
}