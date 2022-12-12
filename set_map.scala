var jetSet = Set("Boeing", "Airbus") // immutable
jetSet += "Lear"
println(jetSet)

import scala.collection.mutable
val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

import scala.collection.immutable.HashSet
val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
/*
 * .->() returns 2 element tuple which consists of key and value
 * */
treasureMap += ( (2, "Find big X on ground.") )
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

import scala.collection.immutable
val romanNumeral = immutable.Map(
  1 -> "I",
  2 -> "II",
  3 -> "III",
  4 -> "IV",
  5 -> "V"
  )
println(romanNumeral(4))
