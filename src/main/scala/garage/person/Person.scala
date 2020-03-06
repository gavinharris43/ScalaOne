package garage.person

abstract  class Person(fullName: String, contactNo:String) {
  val name: String = fullName
  val phoneNumber: String = contactNo


  override def toString ={
  s"Name: ${name.toUpperCase()}, Contact number:$phoneNumber"
  }

}
