package LoadBalancer;

import java.util.ArrayList;
import java.util.List;

public class Controller { 

    private LoadBalancer loadBalancer;

    public void balance(){
      loadBalancer.balance();
    }

    public void setLoadBalancer(LoadBalancer loadBalancer){
        this.loadBalancer = loadBalancer;
    }

    public static void main(String[] args){
        Controller controller = new Controller();
        controller.setLoadBalancer(new RoundRobin());
        controller.balance();
        controller.setLoadBalancer(new WeightedRoundRobin());
        controller.balance();

    }
}
