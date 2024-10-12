package Aula_1;

public class MeuPrimeiroPrograma {

    public static void main(String[] args){

        Cachorro dog = new Cachorro();
        dog.dono = "Carlos William";
        dog.idade = 2;
        dog.nome = "Sansão";
        dog.raca = "Rottweiler";

        System.out.println("Nome do pet: " + dog.nome + "\nIdade do pet: " + dog.idade + "\nRaça do pet: " + dog.raca + "\nDono do pet: " + dog.dono);
        dog.latir();
        dog.morder();
    }

}

