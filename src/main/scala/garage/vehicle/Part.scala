package garage.vehicle


abstract class Part() {
  val name: String
  var cost: Double
  var timeHours: Double
  val timeCost: Double
  val totalCost: Double = cost + timeCost
  val forVehicleType: Class[_ <: Vehicle]
  val broken: Boolean
  val fixed: Boolean


}
