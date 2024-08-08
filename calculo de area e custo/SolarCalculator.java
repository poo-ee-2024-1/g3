public class SolarCalculator {
    private static final double SOLAR_RADIATION = 1000.0; 
    private static final double BASE_COST_PER_SQUARE_METER = 200.0;
    private static final double COST_INCREASE_PER_PERCENT = 1.5; 
   
    public double calculateEnergy(double area, int efficiencyLevel) {
        if (area <= 0 || efficiencyLevel <= 0 || efficiencyLevel > 100) {
            throw new IllegalArgumentException("Área deve ser positiva e eficiência deve estar entre 1 e 100.");
        }

        double efficiencyFraction = efficiencyLevel / 100.0;

        double energy = SOLAR_RADIATION * area * efficiencyFraction;

        return energy;
    }

    public double calculateCost(double area, int efficiencyLevel) {
        
        if (area <= 0 || efficiencyLevel <= 0 || efficiencyLevel > 100) {
            throw new IllegalArgumentException("Área deve ser positiva e eficiência deve estar entre 1 e 100.");
        }

        double additionalCost = efficiencyLevel * COST_INCREASE_PER_PERCENT;
        double cost = BASE_COST_PER_SQUARE_METER * area + additionalCost;

        return cost;
    }

    public static void main(String[] args) {
        SolarCalculator calculator = new SolarCalculator();
        double area = 20.0;
        int efficiencyLevel = 15;

        double energy = calculator.calculateEnergy(area, efficiencyLevel);
        System.out.println("Energia gerada: " + energy + " watts.");

        double cost = calculator.calculateCost(area, efficiencyLevel);
        System.out.println("Custo: R$ " + cost);
    }
}
