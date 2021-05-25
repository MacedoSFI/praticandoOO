package praticandoOO.br.com.felipe.desafios;



public class QuadradosNoRetangulo {
	//não sei fazer
	/*The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that the two dimensions are different).

alternative text

Can you translate this drawing into an algorithm?

You will be given two dimensions

a positive integer length
a positive integer width
You will return a collection or a string (depending on the language; Shell bash, PowerShell, Pascal and Fortran return a string) with the size of each of the squares.*/
	
    double menor;
    int lng = 3;
    int wdth = 5;
    
    public void calcula(int lng, int wdth){
    	
    	menor = lng > wdth ? wdth : lng;
    	
	    System.out.println(menor);
    }

}
