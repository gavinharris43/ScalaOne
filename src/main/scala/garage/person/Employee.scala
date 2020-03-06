package garage.person

import java.util.UUID.randomUUID

class Employee(fullName: String, contactNo:String) extends Person(fullName: String, contactNo:String) {
  val employeeNo: String = "EMP" + randomUUID

  override def toString: String = super.toString.+(s", Employee ID: $employeeNo")
}
