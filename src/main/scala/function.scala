import com.sun.org.apache.xerces.internal.xs.StringList

object function {
  def main(args: Array[String]): Unit = {

    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF","peru" -> "#CD853F")

    colors.foreach {
      element =>
        Map
        println(element)



































        val c2  = getArea(10)
        val x = getArea2(10)
        //    println(c2)
        //    println(x)
        //
        //     println(CircleArea(20))

        //    val CalcCircleArea : (Double) => Double  = CircleArea
        //    println(CalcCircleArea(2.014))

        val CalcCircleArea  = CircleArea((24))
        println(CalcCircleArea)

        // Array of string in scala


        val c = ArrayOfString("Akash","Amit","Arun")
        print(c)


        for (i <- 1 to 10)
          println( "Factorial of " + i + ": = " + factorial(i) )
        println("Returned Value : " + addInt(2,5))
    }
  }
//function
 val getArea  = (radius : Double) =>
  {
    val PI = 3.14
    PI * radius *radius
  }:Double

  //method


  def getArea2 (radius : Double):Double=
  {
    val PI  = 3.14
    PI * radius * radius
  }




 def CircleArea (radius : Double):Double  =
  {
    var PI = 3.14
    PI*radius*radius
  }


  def ArrayOfString( args:String* ) = {
    var i : Int = 0;

    for( arg <- args ){
      println("Arg value[" + i + "] is = " + arg );
      i = i + 1;
    }
  }


  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }


  def addInt( a:Int = 5, b:Int = 7 ) : Int = {
    var sum:Int = 0
    sum = a + b
    sum
  }








}
