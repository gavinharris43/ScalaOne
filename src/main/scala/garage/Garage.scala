package garage

import garage.person.{Employee, Person}
import garage.vehicle.Vehicle

import scala.collection.mutable.ArrayBuffer


class Garage {

  val vehicleList :ArrayBuffer[Vehicle] = ArrayBuffer.empty
  val personList :ArrayBuffer[Person] = ArrayBuffer.empty
  val isOpen = new IsOpen(false)

  def open()= {
    isOpen.open=true
  }

  def close() = {
    isOpen.open=false
  }

  def addVehicle(vehicle: Vehicle) = {
    vehicleList.append(vehicle)
  }

  def registerEmployee(name: String, contactNo: String): Unit = {
    personList.addOne(new Employee(name,contactNo))
  }

  def fixingVehicles: Unit = {

  }

  def calculatingBills(reg : String): Unit ={
    val fixedVehicle =vehicleList.find(vehicle=> vehicle.numberPlate==reg).getOrElse(None)
    //fixedVehicle.
  }
  def contentsVehicles ={
    vehicleList
  }

    def removeVehicle(id :String, vehicleType: String): Unit ={
      vehicleList.filter(vehicle=> vehicle.numberPlate==id && vehicle.vehicleType.getSimpleName==vehicleType).remove(0)
  }

}
