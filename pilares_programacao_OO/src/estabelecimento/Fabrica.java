package estabelecimento;

import java.util.Scanner;

import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Scanners;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Laserjet;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EquipamentoMultifuncional em = null;

		System.out.print("Escolha um equipamento [M, multifuncional] [C, comum]: ");
		char eq = sc.next().charAt(0);

		if (eq == 'M' || eq == 'm') {
			System.out.print("Funções [I,Imprimir][C,Copiar][D,Digitalizar]: ");

			char func = sc.next().charAt(0);
			if (func == 'I' || func == 'i') {
				em = new EquipamentoMultifuncional();
				em.imprimir();

			} else if (func == 'C' || func == 'c') {
				em = new EquipamentoMultifuncional();
				em.copiar();
			} else if (func == 'D' || func == 'd') {
				em = new EquipamentoMultifuncional();
				em.digitalizar();

			} else {
				System.out.println("Opção inválida");
			}

		} else if (eq == 'C' || eq == 'c') {
			System.out.print("Funções [I,Imprimir][C,Copiar][D,Digitalizar]: ");
			char func2 = sc.next().charAt(0);
			if (func2 == 'I' || func2 == 'i') {
				System.out.println("Escolha a impressora [L, Laserjet][D, deskjet]");
				char print = sc.next().charAt(0);
				if (print == 'L' || print == 'l') {
					Laserjet laserjet = new Laserjet();
					laserjet.imprimir();
				} else if (print == 'D' || print == 'd') {
					Deskjet deskjet = new Deskjet();
					deskjet.imprimir();
				}

			} else if (func2 == 'C' || func2 == 'c') {
				Xerox xerox = new Xerox();
				xerox.copiar();

			} else if (func2 == 'D' || func2 == 'd') {
				Scanners scanners = new Scanners();
				scanners.digitalizar();
			} else {
				System.out.println("Opção inválida");
			}

		} else {
			System.out.println("Opção inválida");
		}

		sc.close();
	}
}
