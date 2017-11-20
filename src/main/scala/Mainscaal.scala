//import scala.collection.mutable
//object Mainscaal {
//
//
//  def main(args: Array[String]): Unit = {
//
////    val x = matchTest(24)
////    println(x)
//
//    val m: scala.collection.mutable.HashMap
//      [String, Int] = scala.collection.mutable.HashMap("abc" -> 1, "hello" -> 2)
//   println(m)
//
//
//
//
//    val fruit = Set ("apple","banana" , "orange","coconut","pineapple","elememts")
//
//
//
//
//
//    val f = fruit ("apple")
//    println(f)
//
//    println(fruit("banana"))
//
//   println(fruit("anand"))
//    val i1 = fruit.contains("apple")
//    val i2 = fruit.contains("banana")
//    println(i1)
//    println(i2)
//    val t2 =fruit. contains("anand")
//    println(t2)
//
//
//   val fruit1 = Set (fruit + ("anand", "Rajesh", "Ramesh"))
//    println(fruit1)
//
//   // var list : List[Li]   = List(List (2,3,5,4,5,54,1,5,2,65,0,0,0,0,0,0,0,0,0,0,0),List(1,5,25,5,5))
////var list of list values
//    var y = List(List (1.0, 2.2), List(2, 1.1, -2.1))
//    println(y)
//
////to chck whetehre the ste is empltyt or not
//    var l2 = fruit1.empty
//    println(l2)
//// collectio of set values
//      val cities   = Set ("apple","Hyderabad","Harayana","Chandigarh","Najafagarh")
//      var z    =  Set(cities & fruit)
//     println(z)
//
//// or opeartion on sets of different parameters
//      val city = Set (cities | fruit )
//      println(city )
//// diffrence opeartion on set  a values
//     val n = Set(cities &~ fruit )
//     println(n)
//
//  // union operatio on sets
////
////    val o    = Set(cities&fruit)
////     println(o)
//// not equals operation on set
//    val i  = Set(cities != fruit)
//    println(i)
//
//// set og city not having a ture value
//    val v = Set (city != fruit )
//    println(v)
//
////operation on the sets
//
//
////    var s  = scala.collection.mutable.Set (1,2,3,4,5,6,7,8,9)
////    s +=  4
////    s -= 5
////    println(s)
////
////    var set1  = scala.collection.mutable.Set(7,8,9,54,6,1,56,36,6)
////    set1 +=  7
////    set1 -= 10
////    println(set1)
////    val set = Set(s&set1)
////    println(set)
//
////
////    var t  = set1.clone
////
////    println(t)
////
////
////    val r  = Iterator(1, 2, 3)
////    println(r)
//    // val s: Seq[Integer]  = {1,2,3,454,789,4}
//
//
////
////    Traversable()             // An empty traversable object
////    List()                    // The empty list
////    List(1.0, 2.0)            // A list with elements 1.0, 2.0
////    Vector(1.0, 2.0)          // A vector with elements 1.0, 2.0
////    Iterator(1, 2, 3)         // An iterator returning three integers.
//
////
////    var z  = Map('a' -> 7, 'b' -> 0)   // A map from characters to integers
////    println()
////    println(1 :: 2 :: 3 :: Nil)
////    println(Set(1, 1, 2))
//    //println(Seq(1, 1, 2))
//
////
////    var q1 = Seq(1,2,3,4,5,6,7,8,9)
////    var q2 = Seq(1,2,3,4,5,6,7,8,54,4,5,6,6,6,6)
////    var q3 = Seq(1,2,3,4,5,6,7,8,9,5,5,89,1,0,0,0,0,0)
////    var q4 = Seq(1,2,3,4,5,6,7,8,9,7,41,2,36,1,62,3,0,2)
////    val o  = Seq.concat(q1,q2,q3,q4)
////    println(Seq.concat(q1,q2,q3,q4))
////
////    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
////
////    val nums: Map[Int, Int] = Map()
////
////    println( "Keys in colors : " + colors.keys )
////    println( "Values in colors : " + colors.values )
////    println( "Check if colors is empty : " + colors.isEmpty )
////    println( "Check if nums is empty : " + nums.isEmpty )
////
////    val colors1 = Map("yeloow" -> "values" , "humidity" -> "0000" , "gaming" -> "azure")
////
////    val numes : Map[Int,Int] = Map()
////
////    println("keys in scala :" + colors1.keys)
////    println("Values of colors in"  + colors.values)
////    println("Check if colorsa exist or not" + colors.empty)
////    println("Check if num is empty or not"  + numes.empty)
////    println(numes)
////
//
//
//
//
//    val c1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
//    val c2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
//
//    // use two or more Maps with ++ as operator
//    var col = c1 ++ c2
//    println( "colors1 ++ colors2 : " + col )
//
//     //concatinating two or more maps
//
//    // use two maps with ++ as method
//    col = c1.++(c2)
//    println( "c1.++(c2)) : " + col)
//
//
//   //iterating through hashmap
//     val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF","peru" -> "#CD853F")
//
//    colors.keys.foreach{ i =>
//      print( "Key = " + i )
//      println(" Value = " + colors(i) )}
//  }
//
//
//
//  //scala strings
//
//  val str : String = "Hello"
//  var l  = str.charAt(0)
//  println(l)
//
//  val t1  :String   = str.reverse
//  println(t1)
//
//
//  val t2  :String = str.concat("Anand")
//  println(t2)
//
//  val t3  : String  = str.intern()
//  println(t3)
//
//
//  val t4  : String  = str.map(_.toUpper)
//  println(t4)
//
//
//  val t5 :  String  = str.slice(1,4)
//  println(t5)
//
//  val s: Seq[Char] = str
//  for (elem <- s) {
//    println(s)
//  }
//}
//
//
//  def matchTest(x: Int): String = x match {
//    case 1 => "one"
//    case 2 => "two"
//    case _ => "many"
//  }
//}
