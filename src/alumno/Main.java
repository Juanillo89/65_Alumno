package alumno;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String notas = "";
		Alumno[] alumnos = new Alumno[3];
		for (int i = 0; i < alumnos.length; i++) 
		{
			System.out.println("Introduzaca nombre:");
			alumnos[i] = new Alumno(sc.nextLine());
			System.out.println("Introduzca notas separadas por espacios:");
			notas = sc.nextLine();	
			for (String nota: notas.split(" ")) 
			{
				if(!alumnos[i].anadeNota(Integer.parseInt(nota)))
				{
					System.out.println("La nota " + nota + " no se pudo añadir.");
				}
			}
		}
		sc.close();
		System.out.println("Listado de alumnos:\n"
				+ "Nombre\tNúmero\tAprobados\tMedia");
		for (Alumno alumno: alumnos) 
		{
			System.out.println(alumno.getNombre() + "\t"
					+ alumno.numNotas() + "\t"
					+ alumno.getNumeroAprobados() + "\t\t"
					+ alumno.getNotaMedia());
		}		
	}
}
