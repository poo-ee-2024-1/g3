public class Simulation extends SolarCalculator {

    public SimulationResult simulateProject(Project project, double area, double consumption, double maxPrice, String environmentType, int efficiencyLevel) {
        
        if (area <= 0 || consumption <= 0 || efficiencyLevel <= 0 || efficiencyLevel > 100) {
            throw new IllegalArgumentException("Área, consumo e nível de eficiência devem ser positivos e nível de eficiência deve estar entre 1 e 100.");
        }

        double cost = calculateCost(area, efficiencyLevel);

        boolean success = cost <= maxPrice;

        String message = success ? "Projeto aprovado" : "Projeto excede o preço máximo";

        return new SimulationResult(success, cost, message);
    }
}
