import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class BancoDeDados {

    private static final String URL_BANCO = "jdbc:sqlite:goias.db";
    private static final String[] CIDADES = {
        "Goiânia", "Anápolis", "Aparecida de Goiânia", "Rio Verde", 
        "Catalão", "Jataí", "Itumbiara", "Formosa", "Inhumas", 
        "Senador Canedo"
    };
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        criarBancoDeDados();
        inserirDadosAleatorios();
        adicionarPessoa("Lucas", "Goiânia");
        adicionarPessoa("Mariana", "Anápolis");
        exibirDados();
    }

    private static void criarBancoDeDados() {
        String sqlCriarTabela = "CREATE TABLE IF NOT EXISTS pessoas (" +
                                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                "nome TEXT NOT NULL, " +
                                "cidade TEXT NOT NULL)";
        try (Connection conn = DriverManager.getConnection(URL_BANCO);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sqlCriarTabela);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    private static void inserirDadosAleatorios() {
        String[] nomes = {"Alice", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Júlia"};
        String sqlInserir = "INSERT INTO pessoas (nome, cidade) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL_BANCO);
             PreparedStatement pstmt = conn.prepareStatement(sqlInserir)) {
            for (String nome : nomes) {
                pstmt.setString(1, nome);
                pstmt.setString(2, CIDADES[RANDOM.nextInt(CIDADES.length)]);
                pstmt.executeUpdate();
            }
            System.out.println("Dados aleatórios inseridos com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }

    private static void adicionarPessoa(String nome, String cidade) {
        String sqlInserir = "INSERT INTO pessoas (nome, cidade) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL_BANCO);
             PreparedStatement pstmt = conn.prepareStatement(sqlInserir)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, cidade);
            pstmt.executeUpdate();
            System.out.printf("Pessoa '%s' de '%s' adicionada com sucesso.%n", nome, cidade);
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar pessoa: " + e.getMessage());
        }
    }

    private static void exibirDados() {
        String sqlConsultar = "SELECT * FROM pessoas";
        try (Connection conn = DriverManager.getConnection(URL_BANCO);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlConsultar)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cidade = rs.getString("cidade");
                System.out.printf("ID: %d, Nome: %s, Cidade: %s%n", id, nome, cidade);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar dados: " + e.getMessage());
        }
    }
}
