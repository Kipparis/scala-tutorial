val dec = 31 // decimal
val hex = 0x3a // hex number
val long = 31l // long number
val double = 1.2345e45 // double number
val double_with_literal = 1.2345e45d // double number
val float_with_literal  = 1.2345e12f // float number

val char = 'A' // char
val unicode_char = '\u0041' // unicode char

val hello = "hello"
val escapes = "\\\"\'" // escapes: String = \"'
println("""Welcome to Ultamix 3000.
           type "HELP" for help.""")
println("""Welcome to Ultamix 3000.
          |type "HELP" for help.""".stripMargin)

val true_bool = true
val false_bool = false

val name = "reader"
println(s"Hello, ${name}!") // string interpolator `s`
println(raw"No \\\\\ escaping allowed \n\t\b")
println(f"Pi is approximately ${math.Pi}%.8f.")

println(2.unary_-) // -2
// println(2 toLong) // postfix operators need to be enabled
