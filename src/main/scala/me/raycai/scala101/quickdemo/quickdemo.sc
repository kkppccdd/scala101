
object quickdemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val name = "Ray"                                //> name  : String = Ray
  
  def sayHello(name:String) = {
  	println(s"Hello $name")
  }                                               //> sayHello: (name: String)Unit
  
  sayHello(name)                                  //> Hello Ray
}

class Person(var _first:String,var _last:String){
	var age =0
	def first = _first
	def first_=(value:String){
		_first = value
	}
	
	def last=_last
	def last_=(value:String){
		_last=value
	}
}