class CarEngineStatus{

    private var EngineStatus:String = ""

    fun CarEngineStarted(){
        this.EngineStatus = "Engine is On"

    }

    fun CarEngineStopped(){
        this.EngineStatus = "Engine is Off"
    }

    fun CarStatus():String{
        return this.EngineStatus
    }
}

//class Main{
//
//    fun main(args : Array<String>) {
//        val carstatus = CarEngineStatus()
//        var carstatus1 = CarEngineStatus()
//
//        carstatus.CarEngineStarted()
//        carstatus1.CarEngineStopped()
//
//        println(carstatus.CarStatus())
//        println(carstatus1.CarStatus())
//    }
//}