import java.util.Random;

public class RamdonCharacter {


    public String randomText(String tipo) {
        //Creo una variable sin ningun valor para asignarle el tipo al cual pertenece
        String textFinal = "";
        //Creo una condicion la cual me dice mi variable desde que valores string inician si es
        //Tipo A va a iniciar en "54"
        if (tipo == "Tipo A") {
            textFinal = "54";
        //Si no es Tipo A entonces es Tipo B y mi variable inicia en "08"
        } else {
            textFinal = "08";
        }
        //Creo un for para que me diga el numero de veces que va a hacer mi iteracion en este caso van a ser
        //8 veces
        for (int i = 0; i < 8; i++) {
        //A mi variable TextFinal le voy a adicionar unos numeros ramdon 8 iteraciones el Math random
        //me va a traer numeros del 0 al 1 de tipo double al multiplicarlo por 10 me va a traer numeros
        //double entre 0 y 10 y al utilizar Math round me a aproximar a numeros enteros
            textFinal += Math.round(Math.random() * 10);
        }
        //Retorno el resultado de la variable textFinal con la adicion de los numeros aleatorios
        return textFinal;
    }
}


