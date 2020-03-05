package garage.vehicle


abstract class Part() {
  val name: String
  val cost: Double
  val timeHours: Double
  val timeCost: Double
  val totalCost: Double = cost + timeCost
  val forVehicleType: Class[_ <: Vehicle]
  val broken: Boolean
  val fixed: Boolean


}
