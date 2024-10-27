public class Main {
 public static void main(String[] args) {

 Animales Paco = new Animales();

 Paco.edad = 6;
 Paco.tipo = "Caballo";
 Paco.nombre = "Paco";
 Paco.peso = 4.5;

 Animales Junior = new Animales();

 Junior.edad =5;
 Junior.peso =6;
 Junior.nombre= "Junior";
 Junior.tipo= "Perro";

 Animales Jack = new Animales();

 Jack.edad = 9;
 Jack.peso = 6;
 Jack.nombre = "Jack";
 Jack.tipo = "Conejo";


 Animales lord = new Animales();

 lord.edad = 5;
 lord.peso = 9;
 lord.nombre = "lord";
 lord.tipo = "Gato";

 Paco.detallesAnimales();
 Junior.detallesAnimales();
 Jack.detallesAnimales();
 lord.detallesAnimales();

 }
}