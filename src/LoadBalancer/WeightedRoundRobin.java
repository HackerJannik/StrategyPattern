package LoadBalancer;

public class WeightedRoundRobin extends LoadBalancer{

    public WeightedRoundRobin() {
        super("WeightedRoundRobin");
    }

    @Override
    public void balance() {
        System.out.println("WeightedRoundRobin");
    }
}
