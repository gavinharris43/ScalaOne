package garage.person

abstract  class Person(fullName: String, contactNo:String) {
  var name: String = fullName
  var phoneNumber: String = contactNo


  override def toString ={
  s"Name: ${name.toUpperCase()}, Contact number:$phoneNumber"
  }

}
