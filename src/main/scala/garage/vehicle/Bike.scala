package garage.vehicle

import garage.person.Person

class Bike(plateNo: String, vehicleOwner: Person) extends Vehicle(plateNo: String, vehicleOwner: Person) {
  override val parts: List[Part] = List.empty
}
