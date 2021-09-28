package LoadBalancer;

public class RoundRobin extends LoadBalancer{

    public RoundRobin() {
        super("RoundRobing");
    }

    @Override
    public void balance() {
        System.out.println("RoundRobin");
    }

}
