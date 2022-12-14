// var filename = "default.txt" // imperative style
// if (!args.isEmpty)
//   filename = args(0)
val filename =  // functional style, val variables
  if (!args.isEmpty) args(0)
  else "default.txt"

def gcdLoop(x: Long, y: Long): Long = { // while example
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

def gcd(x: Long, y: Long): Long = {
  if (y == 0) x else gcd(y, x % y)
}

var line = "" // do-while example
do {
  like = readLine()
  println("Read: " + line)
} while (line != "")

val filesHere = (new java.io.File(".")).listFiles // for example
for (file <- filesHere)
  println(file)

val filesHere = (new java.io.File(".")).listFiles // for with filter example
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

val filesHere = (new java.io.File(".")).listFiles // for with multiple filter example
for (
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
) println(file)

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList
def grep(pattern: String) =
  for (
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
  ) println(file + ": " + line.trim)

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList
def grep(pattern: String) =
  for (
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
  ) println(file + ": " + trimmed)

for (i <- 1 to 4) // range example
  println("Iteration " + i)

for (i <- 1 until 4) // range example without upper bound
  println("Iteration " + i)

def scalaFiles = // create new collection
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

val forLineLengths = // create new collection more complex
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length
