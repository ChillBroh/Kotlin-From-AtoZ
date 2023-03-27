     interface Vehicle {
         fun start()
         fun stop()
     }
     class Car:Vehicle{
         override fun start() {
             println("Vehicle started")
         }

         override fun stop() {
             println("Vehicle stopped")
         }
     }