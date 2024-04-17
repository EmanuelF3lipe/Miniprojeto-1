import java.util.Scanner;


public class miniprojeto {
    public static void main(String[] args) throws Exception {

        Scanner escaner = new Scanner(System.in);

        
        System.out.println("Olá, para começarmos me diga seu nome: ");
        String nomeP = escaner.nextLine();
        System.out.println("É um prazer te conheçer, "+nomeP+", vamos começar essa aventura!!");
        System.out.println("\n\nVocê é um aventureiro aprendiz que acabou de chegar na cidade de Whiterun, você sente na pele um ar de misterio e tambem se sente ansioso pelas novas aventuras que estão por vir. Enquanto contemplava as ruas de Whiterun, a cidade parecia pulsar com uma energia própria, cheia de promessas e desafios. Seria sábio explorar cada canto em busca de segredos e oportunidades? Ou deveria seguir o caminho seguro, rumo à guilda local, em busca de orientação e talvez até mesmo de companheiros de jornada? As possibilidades se estendiam diante do aventureiro, cada uma com suas próprias recompensas e perigos. A escolha estava em suas mãos: explorar a cidade ou buscar a sabedoria da guilda?(Escolha entre Explorar a cidade ou Ir para guilda, digite do mesmo jeito desse parenteses.)");
        String decisao1 = escaner.nextLine();
        
        if(decisao1.equals("Explorar a cidade") || decisao1.equals("explorar a cidade")){
            System.out.println("\n\nEnquanto explorava a cidade antes de se dirigir à guilda, Você maravilhou-se com as lindas praças, fontes e as diversas barraquinhas vendendo uma variedade de alimentos. No entanto, à medida que vagava pelas ruas, uma sombra de inquietude se instalava em seu peito. O ambiente se tornava mais sombrio, como se estivesse adentrando uma parte obscura da cidade. De repente, seu olhar se fixou em um beco escuro à sua direita, onde quatro homens pareciam cercar uma mulher, cujos olhos refletiam o medo palpável. Você se vê diante de uma decisão crucial: ajudar a mulher em perigo ou chamar as autoridades? Cada opção carregava seu próprio peso, e ele sabia que o tempo para decidir era curto.(escolha entre Chamar as autoridades ou ajudar sozinho)");
            String decisao2 = escaner.nextLine();
            if(decisao2.equals("Chamar as autoridades")||decisao2.equals("chamar as autoridades")){
                System.out.println("\nVocê corre o mais rapido que pode para encontrar um cavaleiro da cidade, sua sorte é que na esquina da rua 3 guardas estavam em sua ronda diaria pela cidade, você os alcança e pede para o seguir, vocês conseguem chegar a tempo e os homens são presos a mulher te agradeçe e te entrega uma bolsa com 20 peças de ouro que você usa numa estalagem pra passar a noite.");
            }
            else if (decisao2.equals("Ajudar sozinho")||decisao2.equals("ajudar sozinho")){
                System.out.println("\nAo tentar ajudar a mulher sozinho, você se vê confrontado pelos quatro homens que a cercavam. Apesar de sua coragem, a superioridade numérica e talvez até mesmo a habilidade dos agressores se provam avassaladoras. Em meio à luta desigual, você é sobrepujado e sucumbe, deixando para trás um destino trágico e uma missão inacabada.");
            }
            else{
                System.out.println("Você escreveu algo errado tente novamente");
                return;
            }
        }
        else if (decisao1.equals("Ir para a guilda")|| decisao1.equals("ir para a guilda")) {
            System.out.println("\n\nApós decidir seguir para a guilda, você adentra um lugar animado, repleto de pessoas bebendo, conversando e rindo. De repente, uma mulher se aproxima: é a atendente da guilda, convidando-o a fazer seu cadastro. Ela explica que, no momento, apenas missões de nível baixo estão disponíveis. As opções são simples: a primeira, lidar com um acampamento goblin que ameaça a paz da floresta, e a segunda, erradicar uma infestação de ratos que assola os esgotos da cidade. Diante dessas escolhas, qual quest você decide pegar?(Digite Quest goblin ou Quest ratos)");
            String decisao3 = escaner.nextLine();
            if (decisao3.equals("Quest goblin") || decisao3.equals("quest goblin")){
                System.out.println("\n\nCom a decisão da quest de derrotar o acampamento goblin, você parte rumo a floresta onde eles se escondem. A densa vegetação e o silêncio perturbador da floresta aumentam a tensão enquanto você avança cautelosamente. Finalmente, avista o brilho das chamas do acampamento goblin à distância. Com determinação, você se aproxima sorrateiramente, observando os movimentos dos pequenos seres. Uma rápida busca pelo acampamento revela um pote de óleo inflamável esquecido em um canto. Com um sorriso de satisfação, você planeja sua estratégia. Quando a noite cai e os goblins se recolhem ao redor da fogueira, você se aproxima silenciosamente. Com um movimento rápido, arremessa o pote de óleo na fogueira. O líquido inflamável se espalha rapidamente, criando uma explosão ensurdecedora. Os goblins gritam em pânico enquanto são consumidos pelas chamas. Com o coração batendo rápido de adrenalina, você observa a destruição que causou, sabendo que a missão foi completa.");
            }
            else if(decisao3.equals("Quest ratos")||decisao3.equals("quest ratos")){
                System.out.println("Com a missão de erradicar a infestação de ratos gigantes nos esgotos da cidade, você se aventura pelas entranhas escuras e úmidas, preparado para enfrentar a ameaça. Antes de iniciar sua jornada, você adquire de um vendedor ambulante um veneno poderoso, capaz de exterminar os roedores monstruosos. Determinado a acabar com a praga, você avança pelos túneis sinuosos, espalhando o veneno conforme se aprofunda. Os ratos, sedentos por comida, consomem avidamente o veneno, caindo um após o outro. No momento crítico, quando a ameaça parece insuperável, você percebe que a estratégia funcionou. Os roedores começam a cambalear e a cair, vencidos pelo efeito do veneno. Com um suspiro de alívio, observa a infestação diminuir até que a última criatura caia. A cidade está segura mais uma vez, graças à sua coragem e ao poder do veneno adquirido previamente.");
            }
            else{
                System.out.println("Você escreveu algo errado tente novamente");
                return;
            }

        }
        else{
            System.out.println("Talvez você tenha digitado errado tente denovo");
            return;
        }
        escaner.close();
    }
}
