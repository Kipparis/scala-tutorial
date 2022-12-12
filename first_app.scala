import ChecksumAccumulator.calculate
// compile both files with scalac: `scalas class_objects.scala first_app.scala`
// of launch compiler daemon `fsc class_objects.scala first_app.scala`
//      turn it of: `fsc -shutdown`
// launch compilated as `scala Summer`

object Summer_ {
  def main_(args: Array[String]): Unit ={
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}

object Summer extends App { // faster way of defining entrypoint
  for (arg <- args)
    println(arg + ": " + calculate(arg))
}
