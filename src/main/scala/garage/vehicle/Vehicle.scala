package garage.vehicle

import garage.person.Person

abstract class Vehicle(plateNo: String, vehicleOwner: Person) {

  val numberPlate: String = plateNo.toUpperCase()
  val owner: Person = vehicleOwner
  val vehicleType: Class[_ <: Vehicle] = this.getClass
  var parts: List[Part]

  def brokenParts: IterableOnce[Part] with Equals with Serializable = {
    if (parts.exists(part => part broken)) {
      parts.filter(part => part.broken)
    } else {
      None
    }
  }

  override def toString: String = {
    s"Number Plate: $numberPlate, Type ${vehicleType.getSimpleName}, Owner:{${owner.toString}}" +
      s", Broken Parts: ${brokenParts}"
  }


}
