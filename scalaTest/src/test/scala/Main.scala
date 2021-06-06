
object  Main extends App{


  val k = DataDriven.extractData("Sheet1", "add profile", "TestCases")


  //println(s""+k.toArray.mkString("Array(", ", ", ")"))


  println(k.get(1))
}
