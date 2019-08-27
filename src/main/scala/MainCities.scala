object MainCities {
  def main(args: Array[String]): Unit = {
    args(2) match {
      case "+" => printToScreen(new City(args(0), args(1) toLong) + new City(args(3), args(4) toLong))
      case "-" => printToScreen(new City(args(0), args(1) toLong) - new City(args(3), args(4) toLong))
      case _ => println("The operand ("+args(2)+") not implemented yet :(")
    }
  }

  def printToScreen(city: City): Unit = {
    println("=======================================\n\n")
    println(city.cityName + " has " + city.inhabitant + " population")
    println("\n\n=======================================")
  }
}
