package garage

import garage.person.Customer
import garage.vehicle.Car

object mainApp extends App{

 val garage = new Garage

 garage.registerEmployee("Gavin Harris", "07564109584")


 val car = new Car("dp10zyf", new Customer("gavin", "07564109584"))
  println(car.toString)
}
