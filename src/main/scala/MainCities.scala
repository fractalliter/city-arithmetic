object MainCities {
  def main(args: Array[String]): Unit = {
    if(args(2) == "+"){
      printToScreen(new City(args(0), args(1) toLong) + new City(args(3), args(4) toLong))
    }else if(args(2) == "-"){
      printToScreen(new City(args(0), args(1) toLong) - new City(args(3), args(4) toLong))
    }else
      println(s"The operand ("+args(2)+") not implemented yet :(")
  }

  def printToScreen(city: City): Unit = {
    println("=======================================\n\n")
    println(city.cityName + " has " + city.inhabitant + " population")
    println("\n\n=======================================")
  }
}
