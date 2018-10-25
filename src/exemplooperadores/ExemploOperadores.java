package exemplooperadores;

public class ExemploOperadores {

    public static void main(String[] args) {

        int num1 = 0, num2 = 4;
        System.out.println("num1= " + num1 + "\nnum2 =" + num2);
        num1 = num2++;
        System.out.println("(num1=num2++) " + num1 + "\nnum2 =" + num2);
        num1 = ++num2;
        System.out.println("(num1=++num2) \n" + num1 + "=num1 " + "\nnum2 =" + num2);

        num1 = 3;
        num2 = 4;
        int suma;
        suma = num1 + num2;
        System.out.println("suma = " + suma);
        //Tamen pode facerse
        System.out.println("suma = " + (num1 + num2));//sale igual, con esto se puede ahorrar en memoria y la sentencia

        //Casting
        int enteiro = 6;
        float decimal = 2.3f;
        //conversion automática
        decimal = enteiro;
        System.out.println(decimal);
        //Casting
        enteiro = (int) decimal; //De maior a menor precision tenemos que hacer cast

    }

}
