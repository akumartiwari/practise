import java.io.{File, PrintWriter}
object tasks2 {
  def main(args: Array[String]): Unit = {
    val contents = io.Source.fromFile("/home/anand/Desktop/mails-extract.txt").mkString
    var string :String= ""
    val iterator  = """[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}""".r.findAllMatchIn(contents)
     while (iterator.hasNext)
       {
         string = string  +  iterator.next() + "\n"
       }
    val f =  new File("/home/anand/Desktop/mails-extract1.txt")
    val  p  =  new PrintWriter(f)
    p.write(string)
    p.close()
   }
}