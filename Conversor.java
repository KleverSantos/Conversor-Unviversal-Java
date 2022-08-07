import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("o que voc� deseja converter?");
		System.out.println("digite 1 para temperatura");
		System.out.println("digite 2 para peso");
		System.out.println("digite 3 para comprimento");
		System.out.println("digite 4 para volume");
		int forma = input.nextInt();
		
		
		switch (forma) {
		case 1:
			System.out.println("qual modelo de temperatura voc� deseja converter");
			System.out.println("digite 1 para celsius");
			System.out.println("digite 2 para fahrenheit");
			System.out.println("digite 3 para kelvin");
			int forma1 = input.nextInt();
			
			switch (forma1) {
			case 1:
				System.out.println("voc� deseja converter celsius para qual temperatura?");
				System.out.println("digite 1 para fahrenheit");
				System.out.println("digite 2 para kelvin");
				int modelo = input.nextInt();
				
				switch (modelo) {
				case 1:
					System.out.println("entre com a temperatura");
					double temperatura = input.nextDouble();
					System.out.println((9 * temperatura + 160 ) /5 + " graus em fahrenheit");
					break;
					
				case 2:
					System.out.println("entre com a temperatura");
					double temperatura2 = input.nextDouble();
					System.out.println((temperatura2 + 273.15) + " graus em kelvin");
					break;
					
					default:
						System.out.println("comando invalido");
						break;
						
				}
				
			}
					
					switch (forma1) {
					case 2:
						System.out.println("voce deseja converter fahrenheit para qual temperatura?");
						System.out.println("digite 1 para celsius");
						System.out.println("digite 2 para kelvin");
						int forma2 = input.nextInt();
						
						switch (forma2) {
						case 1:
							System.out.println("entre com a temperatura");
							double temperatura = input.nextDouble();
							System.out.println((temperatura - 32.0) * (5.0 / 9.0) + "graus em celsius");
							break;
							
						case 2:
							System.out.println("entre com a temperatura");
							double temperatura2 = input.nextDouble();
							System.out.println(273.5 + (temperatura2 - 32.0) * (5.0 / 9.0) + "graus em kelvin");
							break;
							
							default:
								System.out.println("comando invalido");
								break;
					
				}
				
			}
					
					switch (forma1) {
					case 3:
						System.out.println("voc� deseja converter kelvin para qual temperatura?");
						System.out.println("digite 1 para celsius");
						System.out.println("digite 2 para fahrenheit");
						int forma3 = input.nextInt();
						
						switch (forma3) {
						case 1:
							System.out.println("entre com a temperatura");
							double temperatura = input.nextDouble();
							System.out.println(temperatura - 273.15);
							break;
							
						case 2:
							System.out.println("entre com a temperatura");
							double temperatura2 = input.nextDouble();
							System.out.println((temperatura2 - 273.15) * 9/5 + 32); 
							break;
							
							default:
								System.out.println("comando invalido");
								break;
								
						}
						
					}
					break;
					
		case 2:
			System.out.println("qual peso voc� deseja converter");
			System.out.println("digite 1 para quilos");
			System.out.println("digite 2 para libras");
			System.out.println("digite 3 para on�as");
			int forma2 = input.nextInt();
			
			switch (forma2) {
			case 1:
				System.out.println("voc� deseja converter quilos para qual tipo de peso?");
				System.out.println("digite 1 para libras");
				System.out.println("digite 2 para on�as");
				int formaQuilo = input.nextInt();
				
				switch (formaQuilo) {
				case 1:
					System.out.println("entre com o peso");
					double peso = input.nextDouble();
					System.out.println(peso * 2.205);
					break;
					
				case 2:
					System.out.println("entre com o peso");
					double peso2 = input.nextDouble();
					System.out.println(peso2 * 35.274);
					break;
					
					default:
						System.out.println("comando invalido");
						break;
					
				}
				
			}
			
				
				switch (forma2) {
				case 2:
					System.out.println("voc� deseja converter libras para qual tipo de peso?");
					System.out.println("digite 1 para quilos");
					System.out.println("digite 2 para on�as");
					int formaQuilo1 = input.nextInt();
					
					switch (formaQuilo1) {
					case 1:
						System.out.println("entre com o peso");
						double peso = input.nextDouble();
						System.out.println(peso / 2.205);
						break;
						
					case 2:
						System.out.println("entre com o peso");
						double peso2 = input.nextDouble();
						System.out.println(peso2 * 16);
						break;
						
						default:
							System.out.println("comando invalido");
							break;
					}
					
				}
				
				switch (forma2) {
				case 3:
					System.out.println("voc� deseja converter on�as para qual peso?");
					System.out.println("digite 1 para quilos");
					System.out.println("digite 2 para libras");
					int formaQuilo3 = input.nextInt();
					
					switch (formaQuilo3) {
					case 1:
						System.out.println("entre com o peso");
						double peso = input.nextDouble();
						System.out.println(peso / 35.274);
						break;
						
					case 2:
						System.out.println("entre com o peso");
						double peso2 = input.nextDouble();
						System.out.println(peso2 / 16);
						break;
						
						default:
							System.out.println("comando invalido");
							break;
						
					}
					
				}
				break;
		}
		
		switch (forma) {
		case 3:
			System.out.println("qual comprimento voce deseja converter?");
			System.out.println("digite 1 para metros");
			System.out.println("digite 2 para p�s");
			System.out.println("digite 3 para polegadas");
			int forma3 = input.nextInt();
			
			switch (forma3) {
			case 1:
				System.out.println("voc� deseja converter metros para qual tipo de comprimento?");
				System.out.println("digite 1 para p�s");
				System.out.println("digite 2 para polegadas");
				int conv = input.nextInt();
				
				switch (conv) {
				case 1:
					System.out.println("entre com o comprimento");
					double comp1 = input.nextDouble();
					System.out.println(comp1 / 3.281);
					break;
					
				case 2:
					System.out.println("entre com o comprimento");
					double comp2 = input.nextDouble();
					System.out.println(comp2 * 39.37);
					break;
					
					default:
						System.out.println("comando invalido");
						break;
					
				}
				
			}
			
			switch (forma3) {
			case 2:
				System.out.println("voce deseja converter p�s para qual tipo de comprimento?");
				System.out.println("digite 1 para metros");
				System.out.println("digite 2 para polegadas");
				int escolha = input.nextInt();
				
				switch (escolha) {
				case 1:
					System.out.println("entre com o comprimento");
					double comp1 = input.nextDouble();
					System.out.println(comp1 / 3.281);
					break;
					
				case 2:
					System.out.println("entre com o comprimento");
					double comp2 = input.nextDouble();
					System.out.println(comp2 * 12);
					break;
					
					default:
						System.out.println("comando invalido");
						break;
				}
			}
			
			switch (forma3) {
			case 3:
				System.out.println("voc� deseja converter polegadas para qual tipo de comprimento?");
				System.out.println("digite 1 para metros");
				System.out.println("digite 2 para p�s");
				int escolha = input.nextInt();
				
				switch (escolha) {
				case 1:
					System.out.println("entre com o comprimento");
					double comp1 = input.nextDouble();
					System.out.println(comp1 / 39.37);
					break;
					
				case 2: 
					System.out.println("entre com o comprimento");
					double comp2 = input.nextDouble();
					System.out.println(comp2 / 12);
					break;
					
					default:
						System.out.println("comando invalido");
				}
			}
			break;
		}
			
			switch (forma) {
			case 4:
				System.out.println("qual volume voc� deseja converter?");
				System.out.println("digite 1 para litros");
				System.out.println("digite 2 para gal�o");
				System.out.println("dugite 3 para on�as liquidas");
				int forma4 = input.nextInt();
				
				switch (forma4) {
				case 1:
					System.out.println("voc� deseja converter litros para qual tipo de volume?");
					System.out.println("digite 1 para gal�o");
					System.out.println("digite 2 para on�as liquidas");
					int form = input.nextInt();
					
					switch (form) {
					case 1:
						System.out.println("entre com o volume");
						double volume1 = input.nextDouble();
						System.out.println(volume1 / 4.546);
						break;
						
					case 2:
						System.out.println("entre com o volume");
						double volume2 = input.nextDouble();
						System.out.println(volume2 * 35.195);
						break;
						
						default:
							System.out.println("comando invalido");
							break;
					}
					
				}
				
				switch (forma4) {
				case 2:
					System.out.println("voc� deseja converter gal�o ppara  qual tipo de volume?");
					System.out.println("digite 1  para litros");
					System.out.println("digite 2 para on�as liquidas");
					int escolha = input.nextInt();
					
					switch (escolha) {
					case 1:
						System.out.println("entre com o volume");
						double volume1 = input.nextDouble();
						System.out.println(volume1 * 4.546);
						break;
						
					case 2:
						System.out.println("entre com o volume");
						double volume2 = input.nextDouble();
						System.out.println(volume2 * 160);
						break;
						
						default:
							System.out.println("comando invalido");
							break;
					}
				}
				
				switch (forma4) {
				case 3:
					System.out.println("voc� deseja converter on�as liquidas para qual tipo de volume?");
					System.out.println("digite 1 para litros");
					System.out.println("digite 2 para gal�o");
					int escolha = input.nextInt();
					
					switch (escolha) {
					case 1:
						System.out.println("entre com o volume");
						double volume1 = input.nextDouble();
						System.out.println(volume1 / 33.814);
						break;
						
					case 2:
						System.out.println("entre com o volume");
						double volume2 = input.nextDouble();
						System.out.println(volume2 / 1537);
						
						default:
							System.out.println("comando invalido");
							break;
					}
				}
				break;
			}
		
		}
		
	}
	
