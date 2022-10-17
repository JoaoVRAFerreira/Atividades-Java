import java.util.Scanner;
public class Retangulo
{
    public static void main(String[] args) 
    {
        double base, altura, area, perimetro;
        Scanner leitura = new Scanner (System.in);
        
        System.out.println("Digite aqui a base do retângulo");
        base = leitura.nextDouble();
        System.out.println("Digite a altura do retângulo");
        altura = leitura.nextDouble();
        
        area = base*altura;
        perimetro = (base*2)+(altura*2);
        
        System.out.println("A área do retangulo é: "+area);
        System.out.println("o perimetro do retangulo é: "+perimetro);

    }
}
