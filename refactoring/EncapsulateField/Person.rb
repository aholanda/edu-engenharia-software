# coding: utf-8
class Person
  @name

  def get_name()
    return @name
  end

  def set_name(name)
    @name = name
  end
  
end

p = Person.new
p.set_name("Alice")
puts p.get_name
