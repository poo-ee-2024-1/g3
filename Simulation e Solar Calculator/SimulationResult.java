public class SimulationResult {
    private boolean success;
    private double cost;
    private String message;

    public SimulationResult(boolean success, double cost, String message) {
        this.success = success;
        this.cost = cost;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SimulationResult{" +
                "success=" + success +
                ", cost=" + cost +
                ", message='" + message + '\'' +
                '}';
    }
}
