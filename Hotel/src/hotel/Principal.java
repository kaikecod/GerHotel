package hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Construtores
import gerenciamento.Hóspedes;
import gerenciamento.Quartos;
import gerenciamento.Reservas;
import gerenciamento.checkincheckout;

public class Principal {

    static Scanner scan = new Scanner(System.in);
    static String atendente; 
    static List<Quartos> listaDeQuartos = new ArrayList<>();
    static List<Reservas> listaDasReservas = new ArrayList<>();
    static List<checkincheckout> listaDeCheckIn = new ArrayList<>();
    static List<checkincheckout> listaDeCheckOut = new ArrayList<>();
    

    public static void main(String[] args) {
        Boolean finalizar = true;

       

        while(finalizar){

            System.out.println("======================\n"
                    + "1) Entrar Como Atendente\n"
                    + "2) Entrar Como Administrador\n"
                    + "3) Sair\n"
                    + "======================");
            int escolha = scan.nextInt();

            switch (escolha) {
            case 1: {
            	
            	System.out.println("Informe Seu Nome:");
            	atendente = scan.next(); 
            	
            	
            	GerenciamentoAtendente();
            	finalizar = false;
                break;
            }
            case 2:{
                Boolean finalizar2 = true;

                while (finalizar2) 
                {
                    String usuario = "admadm";
                    String senha = "123123";

                    System.out.println("Login\nUsuario:");
                    String usuario2 = scan.next();
                    System.out.println("Senha:");
                    String senha2 = scan.next();

                    
                    if(usuario.equals(usuario2) && senha.equals(senha2)) 
                    {
                        System.out.println("Bem-vindo!!");
                        GerenciamentoAdm();
                        finalizar2 = false; 
                        finalizar = false; 
                        
                    } 
                    	else if (!usuario.equals(usuario2)) 
                    	{
                    		System.out.println("Usuário incorreto!!");
                    	} 
			                    else if (!senha.equals(senha2)) 
			                    {
			                        System.out.println("Senha incorreta!!");
			                    }
                }
                break;
            }
            case 3:{
                System.out.println("Saindo...");
                finalizar = false;
                break;
            }
            default:{
                System.out.println("Número inválido!!");
                break;
            }
            }
        }
    }

    
    public static void GerenciamentoAdm() {
        System.out.println("Área do Administrador.\n");
        Boolean finalizar4 = true;

        while (finalizar4) {
            System.out.println("======================\n"
                    + "1) Cadastrar Quartos\n"
                    + "2) Relatório\n"
                    + "3) Voltar ao menu\n"
                    + "======================");
            Integer escolha = scan.nextInt();

            switch (escolha) {
                case 1: {
                    System.out.println("Número do quarto:\n");
                    Integer numero = scan.nextInt();

                    boolean quartoExistente = false;
                    for (Quartos lista : listaDeQuartos) {
                        if (lista.getNumero().equals(numero)) {
                            quartoExistente = true;
                            break;
                        }
                    }

                    if (quartoExistente) {
                        System.out.println("Quarto já cadastrado!\n");
                    } else {
                        System.out.println("Tipo:\n");
                        String tipo = scan.next();

                        System.out.println("Preço Da Diária:\n");
                        Float preco = scan.nextFloat();

                        Quartos novoQuarto = new Quartos(numero, tipo, preco, true);
                        listaDeQuartos.add(novoQuarto);
                        System.out.println("Quarto cadastrado com sucesso!\n");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Relatório dos Quartos:");
                    for (Quartos lista : listaDeQuartos) {
                        System.out.println(lista);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Saindo.....");
                    finalizar4 = false;
                    main(null);
                    return;
                }
                default: {
                    System.out.println("Número inválido!");
                    break;
                }
            }
        }
    }
    
    
    public static void GerenciamentoAtendente() {
    	
    	
    	
        listaDeQuartos.add(new Quartos(102, " Casal", 250f ,true));
        listaDeQuartos.add(new Quartos(103, " Solteiro", 125f ,true));
        listaDeQuartos.add(new Quartos(104, " Casal", 250f ,true));
        

        
        System.out.println("Seja Bem-vindo, " + atendente + "!");
        Boolean finalizar3 = true;

        while (finalizar3) {
            System.out.println("======================\n"
                    + "1) Check-In\n"
                    + "2) Check-Out\n"
                    + "3) Reservar Quarto\n"
                    + "4) Alterar Disponibilidade\n"
                    + "5) Disponibilidade dos quartos\n"
                    + "6) Voltar ao menu\n"
                    + "6) Sair\n"
                    + "======================");
            int escolha = scan.nextInt();

            switch (escolha) {
            case 1: {
                if (listaDeCheckIn.isEmpty()) {
                    System.out.println("Nenhum check-in encontrado!");
                } else {
                    System.out.println("Check-ins realizados:");
                    for (checkincheckout checkin : listaDeCheckIn) {
                        System.out.println(checkin.toStringCheckIn());
                    }
                }
                break;
            }
            case 2: {
                if (listaDeCheckIn.isEmpty()) {
                    System.out.println("Nenhum check-in encontrado!");
                    break;
                }

                System.out.println("Informe o nome do Cliente:");
                String NomeCliente2 = scan.next();

                boolean clienteEncontrado = false;

                // Percorrer a lista de check-ins para encontrar o cliente
                for (checkincheckout checkIn : listaDeCheckIn) {
                    if (checkIn.getNomeDoHospede().equalsIgnoreCase(NomeCliente2)) {
                        clienteEncontrado = true;

                        // Cliente encontrado, solicitar a data de check-out
                        System.out.println("Cliente encontrado. Informe a data de check-out (dd/MM/yyyy):");
                        String checkOutData = scan.next();

                        // Criar um novo objeto de check-out com as informações atualizadas
                        checkincheckout checkout = new checkincheckout(
                                checkIn.getNomeDoHospede(),
                                checkOutData,  
                                checkIn.getNumeroDoQuarto(),
                                checkIn.getTipoDeQuarto()
                        );

                        
                        
                        // Adicionar o check-out à lista e remover o check-in correspondente
                        listaDeCheckOut.add(checkout);
                        listaDeCheckIn.remove(checkIn);  // Remove o check-in após o check-out

                        System.out.println("Check-out realizado com sucesso!");

                        // Exibir todos os check-outs realizados até o momento
                        System.out.println("Check-outs realizados:");
                        for (checkincheckout checkoutItem : listaDeCheckOut) {
                            System.out.println(checkoutItem.toStringCheckOut());
                        }
                        break;
                    }
                }

                if (!clienteEncontrado) {
                    System.out.println("Cliente não encontrado. Verifique o nome e tente novamente.");
                }
                break;
            }
            case 3: {
                System.out.println("Informe o nome do cliente:");
                String cliente = scan.next();

                System.out.println("Informe o número do quarto:");
                Integer numeroDoQuarto1 = scan.nextInt();

                boolean quartoEncontrado = false;

                
                for (Quartos quarto : listaDeQuartos) {
                    if (quarto.getNumero().equals(numeroDoQuarto1)) {
                        quartoEncontrado = true;

                        
                        if (quarto.getDisponibilidade()) {
                            System.out.println("Quarto disponível! Realizando a reserva...\n");

                            
                            quarto.setDisponibilidade(false);

                            
                            System.out.println("Informe a data de check-in (dd/MM/yyyy):");
                            String dataCheckIn = scan.next();

                           
                            checkincheckout novoCheckIn = new checkincheckout(cliente, dataCheckIn, numeroDoQuarto1, quarto.getTipo());
                            listaDeCheckIn.add(novoCheckIn);

                           
                            Reservas novaReserva = new Reservas(cliente, dataCheckIn,null, quarto.getTipo());
                            listaDasReservas.add(novaReserva);

                            System.out.println("Reserva realizada com sucesso!\n");
                            System.out.println(novaReserva); 

                        } else {
                            System.out.println("O quarto está ocupado. Por favor, escolha outro quarto.\n");
                        }
                        break;
                    }
                }

               
                if (!quartoEncontrado) {
                    System.out.println("Quarto não encontrado. Tente novamente.");
                }
                break;
            }
               case 4: {
                    System.out.println("Informe o número do quarto para trocar a disponibilidade:\n");
                    Integer numeroDoQuartoDisp = scan.nextInt();
                    Boolean quartoEncontrado = false;

                    for (Quartos lista : listaDeQuartos) {
                        if (lista.getNumero().equals(numeroDoQuartoDisp)) {
                            quartoEncontrado = true;

                            
                            if (lista.getDisponibilidade()) {
                                lista.setDisponibilidade(false); 
                                System.out.println("Quarto ocupado.");
                            } else {
                                lista.setDisponibilidade(true); 
                                System.out.println("Quarto desocupado.");
                            }
                            break; 
                        }
                    }
                    if (!quartoEncontrado) {
                        System.out.println("Quarto não encontrado. Tente novamente.");
                    }
                    break; 
                }
                case 5: {
                    
                	  System.out.println("Disponibilidade dos quartos:");
                      for (Quartos lista : listaDeQuartos) {
                          System.out.println(lista);
                      }
                      break;
                }
                case 6: {
                    System.out.println("Saindo....");
                    finalizar3 = false;
                    break; 
                }
                case 7:{
                	main(null);
                }
                default: {
                    System.out.println("Número inválido!");
                    break; 
                }
            }
        }
    }

		
	}
    

