throw new IllegalArgumentException

val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundException => println("file not found exception")
  case ex: IOException => println("io exception")
} finally {
  f.close() // close file guaranteed
}

import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) = // catch can return values
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }

def f(): Int = try return 1 finally return 2 // result: 2
