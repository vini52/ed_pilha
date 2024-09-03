package view;
import model.*;
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		int[] vetor = {19, 44, -1, 8, -10, 75, -15, 0};
		
		for(int num : vetor) {
			p.push(num);
		}
		
	}

}
