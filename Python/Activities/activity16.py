class car:
    'This class represents a car details'
    def _init_(self,manufacturer, model, make, transmission, color):
         self.manufacturer= manufacturer
         self.model=model
         self.make=make
         self.transmission=transmission
         self.color=color

    def accelerate(self):
        print(self.manufacturer ,self.model ,"is moving")
    def stop(self):
        print(self.manufacturer ,self.model ,"is stop")

car1 = car("Toyota", "Camry", "2022", "Automatic", "Silver")
car2 = car("Ford", "Mustang", "2021", "Manual", "Red")
car3 = car("Honda", "Civic", "2023", "CVT", "Black")

car2.accelerate()
car2.stop()


