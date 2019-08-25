class City(name: String, pop: Long) {
  require(name != null, pop !=0)
  val cityName: String = name
  val inhabitant: Long = pop

  /**
   * Add to city instance with each other the name of two city will be merged and populations will be added
   * @param that City
   * @return City
   */
  def +(that: City): City = new City(nameMerger(this.cityName, that.cityName), this.inhabitant + that.inhabitant)

  /**
   * Subtract to city instance with each other, the same characters in name of two city will be dropped and populations will be subtracted
   * @param that City
   * @return City
   */
  def -(that: City): City = new City(dropSameChars(this.cityName, that.cityName), this.inhabitant - that.inhabitant)

  /**
   * Merge two provided city name character by character and add concat remind of the longest one
   * @param cityName1 String
   * @param cityName2 String
   * @return String
   */
  private def nameMerger(cityName1: String, cityName2: String): String = {
    if((cityName1 compareTo cityName2) != 0) {
      var mergedCityName: String = ""
      val len = Math min (cityName1 length, cityName2 length)
      for (i <- 0 until len) mergedCityName += (cityName1(i) toString) + ((cityName2(i) toString) toLowerCase)
      if (len == (cityName1 length)) mergedCityName += cityName2 substring len
      else mergedCityName += cityName1 substring len
      mergedCityName
    }
    else
      cityName1
  }

  /**
   * Drop the same chars in two city and merge the remind strings
   * If they are the same city names it will return an empty string
   * @param cityName1 String
   * @param cityName2 String
   * @return String
   */
  private def dropSameChars(cityName1: String, cityName2: String): String = {
    if((cityName1 compareTo cityName2) != 0)
      nameMerger(cityName1 filter (ch=> !(cityName2 contains ch)),cityName2 filter (ch => !(cityName1 contains ch)))
    else
      ""
  }

  override def toString = "City of " + cityName + " has " + inhabitant + " population"
}
