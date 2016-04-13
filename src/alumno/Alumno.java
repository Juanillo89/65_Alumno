package alumno;

public class Alumno implements IAlumno
{
	private int[] notas;
	private String nombre;
	private int contNotas;
	
	public Alumno(String nombre)
	{
		this.nombre = nombre;
		notas = new int[10];
		contNotas = 0;
	}
	
	@Override
	public String getNombre() 
	{
		return nombre;
	}

	@Override
	public boolean anadeNota(int nota) 
	{
		if(contNotas == notas.length)	
			return false;
		if(nota < 0 || nota > 10)
			return false;
		notas[contNotas] = nota;
		contNotas++;
		return true;
	}

	@Override
	public int[] getNotas() 
	{
		int[] notasExistentes = new int[contNotas];
		for (int i = 0; i < notasExistentes.length; i++) 
		{
			notasExistentes[i] = notas[i];
		}
		return notasExistentes;
	}

	@Override
	public int numNotas() 
	{
		return contNotas;
	}

	@Override
	public float getNotaMedia() 
	{
		float suma = 0;
		if(contNotas == 0)
			return -1;
		for (int i = 0; i < getNotas().length; i++) 
		{
			suma += getNotas()[i];
		}
		return suma / contNotas;
	}

	@Override
	public int getNumeroAprobados() 
	{
		int aprobados = 0;
		for (int i = 0; i < getNotas().length; i++) 
		{
			if(notas[i] >= 5)
				aprobados++;
		}
		return aprobados;
	}

	@Override
	public void borrarNotas() 
	{
		contNotas = 0;
	}

}
