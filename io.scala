import scala.io.Source

def widthOfLength(s: String): Int = s.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines() // this returns iterator
    .toList                                       // this returns list

  var maxWidth = 0  // using var
  for (line <- lines) maxWidth = maxWidth.max(widthOfLength(line))

  val longestLine = lines.reduceLeft( // using val
    (a,b) => if (a.length > b.length) a else b
  )
  maxWidth = widthOfLength(longestLine)

  // example with for
  for (line <- Source.fromFile(args(0)).getLines()) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }

  println("=" * 70)
  println("=" * 70)

  // example with foreach
  Source.fromFile(args(0)).getLines()
    .foreach(line =>
      println(" " * (maxWidth - widthOfLength(line)) + line.length + " | " + line)
    )
} else Console.err.println("Please enter filename")
