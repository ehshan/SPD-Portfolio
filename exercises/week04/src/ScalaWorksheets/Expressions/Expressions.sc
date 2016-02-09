//The REPL

//Q1
var num = 17
println(num)

//Q2
var alpha = "ABCDE"
println(alpha)

//Q3
alpha = "DEF1234"
println(alpha)

//Q4
var doub = 15.56
println(doub)

//EXPRESSIONS

//Q1
var sky = "sunny"
var temp = 50


var weather = if ((sky = "sunny") && (temp <= 80))
  true
else
  false


//Q2
weather = if(((sky = "sunny") || (sky ="partly cloudy")) &&
  (temp <= 80))
  true
else
  false

//Q3
weather = if(((sky = "sunny") || (sky ="partly cloudy")) &&
  ((temp <= 80) || (temp > 20)))
  true
else
  false

//Q4
def fahrenheitToCelsius(temp : Double): Double ={
  (temp - 32.0) * (5.0 / 9.0)
}

var newTemp = fahrenheitToCelsius(50.0)


//Q5
def celsiusToFahrenheit(temp : Double): Double ={
  temp * (5.0 / 9.0) + 32.0
}

newTemp = celsiusToFahrenheit(11.0)
