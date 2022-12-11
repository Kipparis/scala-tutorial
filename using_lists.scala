// val oneTwoThree = List(1,2,3)
// val oneTwoThree = 1 :: 2 :: 3 :: Nil
// val oneTwoThree = Nil.::(3).::(2).::(1)
val oneTwoThree = Nil.::(3).::(2).::(1)
val fourFive = List(4,5)
// val oneTwoThreeFourFive = oneTwoThree ::: fourFive // if method name is ending on : than it's called from right operand
// val oneTwoThreeFourFive = oneTwoThree.:::(fourFive)
val oneTwoThreeFourFive = fourFive.:::(oneTwoThree)
println("Sum of " + oneTwoThree + " and " + fourFive + " is " + oneTwoThreeFourFive)

val threeFour = List(3,4)
val twoThreeFour = 2 :: threeFour // cons operator
println(twoThreeFour)

// list has all kind of helpful functional style methods
