package OOPsystem.Interface;

public class Car implements Engine, Media, Brake {
    @Override
    public void start() {
        System.out.println("Car is started");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }
    @Override
    public void acc() {
        System.out.println("Car is accelerating");
    }
    @Override
    public void play() {
        System.out.println("Car is playing");
    }
    @Override
    public void pause() {
        System.out.println("Car is paused");
    }
    @Override
    public void next() {
        System.out.println("Car is next");
    }
    @Override
    public void previous() {
        System.out.println("Car is previous");
    }
    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
}
    

