public class Main {
    public static void main(String[] args) {
        Project project = new Project("Projeto Solar", "Instalação de painéis solares em uma área residencial.");

        Simulation simulation = new Simulation();
        double area = 50.0;
        double consumption = 5.0; // em kWh por metro quadrado
        double maxPrice = 11000.0;
        String environmentType = "residencial";
        int efficiencyLevel = 20; 


        SimulationResult result = simulation.simulateProject(project, area, consumption, maxPrice, environmentType, efficiencyLevel);


        System.out.println(result);
    }
}
