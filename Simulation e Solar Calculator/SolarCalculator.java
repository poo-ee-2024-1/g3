public class SolarCalculator {
    private static final double SOLAR_RADIATION = 1000.0; 
    private static final double BASE_COST_PER_SQUARE_METER = 200.0;
    private static final double COST_INCREASE_PER_PERCENT = 1.5; 
   
    public double calculateEnergy(double area, int efficiencyLevel) {
        if (area <= 0 || efficiencyLevel <= 0 || efficiencyLevel > 100) {
            throw new IllegalArgumentException("Área deve ser positiva e eficiência deve estar entre 1 e 100.");
        }

        double efficiencyFraction = efficiencyLevel / 100.0;
        return SOLAR_RADIATION * area * efficiencyFraction;
    }

    public double calculateCost(double area, int efficiencyLevel) {
        if (area <= 0 || efficiencyLevel <= 0 || efficiencyLevel > 100) {
            throw new IllegalArgumentException("Área deve ser positiva e eficiência deve estar entre 1 e 100.");
        }

        double additionalCost = efficiencyLevel * COST_INCREASE_PER_PERCENT;
        return BASE_COST_PER_SQUARE_METER * area + additionalCost;
    }
}
