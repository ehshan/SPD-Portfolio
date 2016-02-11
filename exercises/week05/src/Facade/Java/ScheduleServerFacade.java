package Facade.Java;

public class ScheduleServerFacade {

    private ScheduleServer server;

    public ScheduleServerFacade(ScheduleServer scheduleServer) {
        this.server = scheduleServer;
    }

    public void startServer() {
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");
    }

    public void stopServer() {
        server.releaseProcesses();
        server.destory();
        server.destroySystemObjects();
        server.destoryListeners();
        server.destoryContext();
        server.shutdown();
    }
}