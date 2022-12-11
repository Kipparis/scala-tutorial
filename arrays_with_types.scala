// val greetStrings = new Array[String](3) // тоже будет работать
val greetStrings: Array[String] = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n" // func(arg) = setval == func.update(arg, setval)

for (i <- 0 to 2) print(greetStrings(i))
for (i <- 0 to 2) print(greetStrings apply i) // func(arg) == func.apply(arg) == func apply arg
for (i <- 0 to greetStrings.length - 1) print(greetStrings(i))
greetStrings.foreach(print)
greetStrings foreach print

val numNames = Array("zero ", "one ", "two\n")

numNames.foreach(print)
Array[String]("zero ", "one ", "two\n") foreach print
Array("zero ", "one ", "two\n")
  .foreach(print) // in this case you're not allowed to remove . and ()
