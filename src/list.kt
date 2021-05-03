fun main(){
println(evenIdices(listOf("mary","sarah","guyo","constant","sharon","diana","flora","gume","kame","mercy")))
    var nums= listOf(34.7,78.0,89.0)
    println(avgSum(listOf(1.2,1.3,1.6)))
    var person=listOf(
        Person("Sarah",24,1.2,56.3),
        Person("kame",27,3.2,50.1),
        Person("sabdio",40,4.3,50.3),
        Person("john",39,20.3,40.1)

    )
    var sortedPerson=person.sortedByDescending { person->person.age }
    println(sortedPerson)
   peopleData()
    println(car(listOf(120,180,140)))
}





fun evenIdices(name:List<String>):List<String> {
    var p = mutableListOf<String>()
    for (evenIdices in name){

        if (name.indexOf(evenIdices) % 2 == 0) {
            p.add(evenIdices)
        }
        }
    return p
}
data class AvgSum(var average:Double,var sum:Double)
fun avgSum(nums:List<Double>):AvgSum{
    var sum=nums.sum()
    var average=nums.average()
    var avgSum=AvgSum(average,sum)
    return avgSum

}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

fun peopleData(){
    var person=mutableListOf(
        Person("Sarah",24,1.2,56.3),
        Person("kame",27,3.2,50.1),
        Person("sabdio",40,4.3,50.3),
        Person("john",39,20.3,40.1)
    )
    person.addAll(listOf(
        Person("jillo",30,2.1,29.3),
        Person("huka",24,2.3,40.7),

    ))
    println(person)

}
data class Car(var registation:String,var millage:Int )
  fun car(millage:List<Int>):Int{
     var totalMillage = millage.average().toInt()
      return totalMillage

  }