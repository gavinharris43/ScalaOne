package garage.person

import java.util.UUID.randomUUID

class Customer (fullName: String, contactNo:String)extends Person(fullName: String, contactNo:String) {
  val customerId: String = "CUS" + randomUUID

  override def toString: String = super.toString.+(s", Customer ID: $customerId")

}
