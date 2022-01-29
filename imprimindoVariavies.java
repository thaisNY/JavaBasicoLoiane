public class imprimindoVariaveis {
    public static void main(String args[]) {
        byte idade1 = 15;
        short idade2 = 16;
        int idade3 = 17;
        long idade4 = 18;
        
        System.out.println("O valor da idade = " + idade1);
        System.out.println("O valor da idade = " + idade2);
        System.out.println("O valor da idade = " + idade3);
        System.out.println("O valor da idade = " + idade4);
        
        double valorPassagem = 2.90;
        float valorTomate = 0.75F;
        
        System.out.println("Valor da passagem = " + valorPassagem);
        System.out.println("Valor do toamte = " + valorTomate);
        
        char o = 'o';
        char i = 'i';
        System.out.print(o+i + "\n");
        System.out.print(""+o+i);
        
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("O valor de vdd é " + verdadeiro);
        System.out.println("O valor de falso é "+falso);
    }
}
