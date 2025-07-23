package application;

import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Exercicio2 {
	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Fazer boa viagem");
		Comment c2 = new Comment("Uau, isso é incrível!");
		Comment c3 = new Comment("Boa noite");
		Comment c4 = new Comment("Que a Força esteja com você");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para a Nova Zelândia", "Vou visitar esse país maravilhoso!", 12);
		p1.addComment(c1);
		p1.addComment(c2);

		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite pessoal", "Vejo você amanhã", 5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
