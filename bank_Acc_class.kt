fun main()
{
    val Account = Account()
    Account.insert(9555 , "Dhanajit" , 10000f)
    Account.deposit(100f)
    Account.withDraw(10000f)
    Account.withDraw(150f)
}

class Account
{
    //properties
    var accNo:Int = 0
    var name:String? = null
    var amount:Float = 0f

    //member functions
    fun insert(ac:Int , nm:String , am:Float )
    {
        accNo = ac
        name = nm
        amount = am
        println("Hello the account is created")
        println("account No $accNo , Name is $name , amount is $amount ")
    }

    fun deposit(money:Float)
    {
        amount += money
        println("current balance " + amount)
    }

    fun withDraw(money:Float)
    {
        if(amount < money)
        {
            println("Not Sufficient Fund")
        }
        else
        {
            amount -= money
            println("current balance " + amount)
        }
    }
}