import scala.collection.mutable.ListBuffer

object Student{
  def main(args:Array[String])
  {
    case class Student(name: String, `class`:String ,marks:Option[Int] )
    val someList : ListBuffer[Option[Student]] = new scala.collection.mutable.ListBuffer[Option[Student]]

      someList +=  Some(Student("a","5th",Some(47)) )
      someList += None
      someList +=  Some(Student("c","5th",Some(47)))
      someList +=  None
      someList +=  Some(Student("e","5th",Some(47)))
      someList +=  Some(Student("f","5th",Some(47)))
      someList +=  Some(Student("g","7th", None))
      someList +=  Some(Student("h","8th", None))
      someList +=  Some(Student("i","9th", None))
      someList +=  Some(Student("j","10th", None))
        var i  = 0
    val j=someList.filter(_.isDefined)
      val list1 = someList.filter(_.isDefined).map {
        case Some(i)  =>
          if (i.marks.isDefined) {
            i
          }
          else
            null
      }



   val list3 = someList.filter(x=>x.isDefined && x.get.marks.isDefined).map(_.get)

  }
}
