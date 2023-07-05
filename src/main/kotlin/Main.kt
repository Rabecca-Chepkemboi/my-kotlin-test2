 fun main() {

     //data types//

    var fullname :String= "Rabecca Chepkemboi"
     println(fullname)

     var age : Byte = 24
     println(age)

     var phoneNumber : Int = 723415245
     println(phoneNumber)

     var weightInKg : Byte = 61
     println(weightInKg)

     val iskenyan : Boolean = true
     println(iskenyan)

     val notkenyan : Boolean = false
     println(notkenyan)



     var result = greeting("Ada")
    var results =  modulus(67,9)
     var ans = addition(21, 43, 12, 33)
     var answer = fact("I am brave")
     var answe = names("Chepkemboi", 22)
     var got = length("Anything is achievable")
     var get = detail("Kaggie")
     var put = detail("Chep")
 }


//functions//

 fun greeting(name:String){
     println("Hello $name")
 }
 fun modulus(num1: Int,num2: Int):Int{
     var division = num1/num2
     return  division
 }
 fun addition(num1: Int,num2: Int,num3:Int,num4:Int):Int{
     var sum = num1 + num2 + num3 + num4
     return sum
 }
 fun fact(name:String){
     var amaizing = name
     println(amaizing)
 }


//strings//

 fun instutution(){
     var school="akirachx"
     println(school[0]+""+school[2]+""+school[3])
 }
 fun names(name: String, age:Int):String{
     var greeting="Hi, my name is $name and I am $age years old"
     return greeting
 }
 fun length(len:String):String{
     var lengthln= len.length
     return len
 }
 fun detail(tag: String){
     var name="Kaggie"
     if (tag==(name)){
         println("That's me")
     }
     else{
         println("I don't know who that is ")
     }
 }



// Movie tickets are typically priced differently based on the age of moviegoers.
// A children's ticket price of $15 for people 12 years old or younger.
// A standard ticket price of $30 for people between 13 and 60 years old. On
// Mondays, discount the standard ticket price to $25 for this same age group.
// A senior ticket price of $20 for people 61 years old and older. Assume that
// the maximum age of a moviegoer is 100 years old.
// A  -1 value to indicate that the price is invalid when a user inputs an
// age outside of the age specifications.

 fun tickets(age: Int) {
     print("Enter your age: ")
     val age = readLine()?.toInt()

     val ticketPrice = when {
         age != null && age <= 12 -> 15
         age != null && age <= 60 -> {
             if (getDayOfWeek() == "Monday") {
                 25
             } else {
                 30
             }
         }
         age != null && age <= 100 -> 20
         else -> -1
     }

     println("Ticket price: $$ticketPrice")
 }

 fun getDayOfWeek(): String {
     print("Enter the day of the week: ")
     return readLine() ?: "Unknown"
 }












