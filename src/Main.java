public class Main {

    String personas[];

    public static void main(String[] args) {
        // Creates a new instance of the functions class
        functions f = new functions();

        // Print the header of the table
        System.out.printf("%5s | %-10s | %-30s | %-4s | %-8s | %-10s | %-10s | %-15s | %-15s | %-15s | %-15s\n","ID", "CÃ©dula", "Nombre Completo","Sexo", "E. Civil", "Nacido","Ocupación","Gusto Musical","Creencias","Gusto Culinario","Genero");
        System.out.println("------+------------+--------------------------------+------+----------+-------------+-----------+-----------------+-----------------+-----------------+-----------------");


        cls_Persona[] Persona = new cls_Persona[1];



        Persona[0] = new cls_Persona();
        Persona[0].setCedula(f.Cedula());
        Persona[0].setNombre(f.Nombre() + " " + f.Apellido() + " " + f.Apellido());
        Persona[0].setSexo(f.Sexo());
        Persona[0].seteCivil(f.estCivil());
        Persona[0].setOcupacion(f.Ocupacion());

        System.out.println(Persona[0].getCedula() + " " + Persona[0].getOcupacion());



        // Print 25 random people
//        for (int i = 0; i < 25; i++) {
//            System.out.printf("%5s | %-10s | %-30s | %-4s | %-8s | %-10s | %-10s | %-15s | %-15s | %-15s | %-15s \n",
//                    f.ponCeros(String.valueOf(i+1),5),
//                    f.Cedula(),
//                    f.Nombre() + " " + f.Apellido() + " " + f.Apellido() ,
//                    f.Sexo(),
//                    f.estCivil(),
//                    f.fecNac(),
//                    f.Ocupacion(),
//                    f.GustoMusical(),
//                    f.Creencias(),
//                    f.Culinario(),
//                    f.Genero());
//        }
    }

}