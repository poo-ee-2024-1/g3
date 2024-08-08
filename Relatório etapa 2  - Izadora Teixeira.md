# Projeto Marketplace de Painéis Solares
Izadora Teixeira - 201800245

## Introdução
Este projeto é um marketplace para usuários e fornecedores de painéis solares. O objetivo é que um cliente qualquer possa acessar o marketplace e forncecer à plataforma as requisições e características que deseja no seu projeto. As mesmas serão então apresentadas a forncedores cadastrados na plataforma que responderão com propostas a serem avaliadas pelos clientes. Ainda que o projeto tenha um grande potencial, o resultado apresentado não passa de um esqueleto com as funcionalidades mais básica visto que o tempo proposto e os aspectos da linguagem ainda a serem aprendidos limitaram a atução dos desenvolvedores (que são novos no uso de algumas das ferramentas e da linguagem).

## Configuração
Para rodar o projeto localmente, foram seguidos os seguintes passos:
1. O repositório criado pelo professor foi clonado para o meu Git pessoal, para que fosse possível adicionar os arquivos desenvolvidos por mim.
2. Para que pudesse fazer a edição foi necessário instalar o GitHub Desktop (o prórpio GitLab direcionou para a instalação) e o Visual Studio Code (instalação feita com base em um tutorial online).
3. Antes que o projeto fosse clonado no GitHub Desktop foi necessário fazer login no mesmo com as credenciais do GitLab. 
4. O uso mais detalhado das ferramentas está descrito abaixo.

## Contribuição
Minha principal contribuição ao projeto foi o desenvolvimento do front-end, ou seja, as telas que servirão de interface com o usuário onde serão adicionados os dados de entrada e por meio das quais os resultados serão acessado. Para desenvolver essa parte usei o SceneBuilder em associação com o VS Code.
De inicio estava dependendo compeltamento do SceneBuilder para a criação e alteração de quaisquer aspectos relacionados as telas da plataforma, no entanto a medida que o código era gerado pela aplicação ficou mais fácil associar os campos as linhas de código e perceber o papel de cada coisa. Continuei usando o SceneBuilder porque aspectos como o posicionamento dos campos ainda me é difícil abstrair sem a real visualização, no entanto o nome dos campos, como era prenchido e aspectos de formatação foram ficando mais claros até que eu já conseguisse fazer pequenas alterações como exclusão de campos ou alteração de nome, fonte e tamanho da letra diretamente nas linhas de códigos já escritas.
Eu já tinha visto ferramentas como essa sendo usadas no meu trabalho mas essa foi a primeira vez que eu realmente usei e achei muito boa e útil. Graças a ela mudanças podem ser facilmente feitas, o que para mim foi bom pois me permitiu ir comentendo erros que iam sendo corrigidos de acordo com o processo de integração das partes. Por isso, existem inclusive arquivos que não serão utilizados por serem versões já refeitas ou por serem funções a serem implementadas. 
De acordo com que as alterações eram feitas, se era uma mudança maior ou a inclusão/exclusão de um campo relevante eu criava uma nova versão do arquivo e fui mantendo as novas versões registradas em uma pasta específica.

# Relatório de Domínio e Conformidade

## 1. Domínio do Ambiente e Ferramentas

### 1.1 Git e GitHub
- **Controle de Versão**: Utilizamos o Git para versionamento do código, assim cada um podia abrir a sua brnach e ir dando comit de acordo com o tópico que escolhia trabalhar. Isso nos permitiu ver alterações e inclusões feitas por cada um. O repositório do projeto está hospedado no GitHub, facilitando a colaboração e o gerenciamento de tarefas.
- **Branching**: Paricularmento o processo de criar uma nova branch é algo com o que sou familiar devido as minha atividades no trabalho. Para criar uma nova branch eu primeiro crio uma issue com a descrição do problema a ser resolvido, depois crio uma branch com o mesmo nome e código da issue.
- **Commits e Pull Requests**: Uma vez que os arquivos estavam devidamente alterados as mudanças salvam eram altomaticamente transferidas do VSCode para o GitHub Desktop onde então ao preencher o campo do nome da branch e a descrição das alterações feitas era possível fazer o comit, sendo necessário dar um push origin para que o repositório fosse atualizado no GitLab. Após o arquivo estar atualizado no meu repositório clonado, eu solicitava um pull request para que as minhas alterações pudessem ser incluídas no repositório principal.

### 1.2 VS Code
- **Editor de Código**: Para pode editar o código, foi preciso primeiro clonar o repositório do GitLab para o GitHub, sendo o mesmo aberto no VS Code para edição dos arquivos. No VSCode a criação de novos arquivos e organização dos mesmos em pastas é fácil. A ferramenta também ajuda na escrita do código através de seus pluging que ajudam na detecção de erro e sugestões de preenchimento. Também sou habituada a usar essa ferramenta no meu ambiente de trabalho, sendo que trabalho com ela a pelo menos 2 anos.
- **Debugging**: O VS Code foi usado para depuração do código Java, permitindo identificar e corrigir problemas de forma eficaz.

### 1.3 BlueJ
- **Modelagem e Visualização**: BlueJ foi utilizado para modelagem e visualização das classes do projeto, o que ajudou na compreensão da estrutura e das interações entre os componentes. Isso permitiu que alterações fossem feitas quando as partes não atingiam a integração. Algumas das telas que eu criei foram alteradas várais vezes por conta de alterações que foram necessárias no resto do código e o BlueJ facilitou a identificação do que precisava ser alterado.

## 2. Domínio da Linguagem Java

### 2.1 Criação de Classes
- **Classe `painel`**: Essa classe não chegou a fazer parte do corpo final do projeto mas foi criada na fase de concepção e expressa o objetivo inicial da plataforma. Ela foi cirada para representar um painel solar com atributos como `eficência` e `custo`, e métodos para acessar essas informações. A estrutura da classe está documentada e segue as melhores práticas de design.

```java
public class Painel {
    private double area;
    private double potencia;
    private double preço;
    private double custo;
    private double eficiencia;

    public PainelSolar(double area, double potencia, double preço) {
        this.area = area;
        this.potencia = potencia;
        this.preço = preço;
        this.custo = 0;
        this.eficiencia = 0;;
    }

    public String getCusto() {
        return this.custo = this.area*this.preço;
    }

    public double getEficiencia() {
        return this.eficiencia = this.area*this.potencia;
    }
}
