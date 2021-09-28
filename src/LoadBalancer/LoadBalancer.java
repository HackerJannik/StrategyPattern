package LoadBalancer;

public abstract class LoadBalancer {

    public String algorithm;

    public abstract void balance();

    public LoadBalancer(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getAlgorithm() {
        return algorithm;
    }
}
