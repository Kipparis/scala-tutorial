val pair: (Int, String) = (99, "Hello") // literally tuple
println(pair._1)
println(pair._2)

// use of _1, _2 because they return their own type
// .apply() in that case would always return Any so this kind of interface would be bullshit
