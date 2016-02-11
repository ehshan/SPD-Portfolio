package Facade.Scala

class ScheduleServerFacade(scheduleServer: ScheduleServer) {

  var server : ScheduleServer = scheduleServer


  def startServer = {
    server.startBooting
    server.readSystemConfigFile
    server.init
    server.initializeContext
    server.initializeListeners
    server.createSystemObjects
    System.out.println("Start working......")
    System.out.println("After work done.........")
  }

  def stopServer = {
    server.releaseProcesses
    server.destory
    server.destroySystemObjects
    server.destoryListeners
    server.destoryContext
    server.shutdown
  }
}