

//This test singlehandedly made me want to drop out of this course
//Still, its a good test on theory!



/*======================================================================================
Study Center....: Universidad TÃ©cnica Nacional
Campus..........: PacÃ­fico (JRMP)
College career..: IngenierÃ­a en TecnologÃ­as de InformaciÃ³n
Period..........: 2C-2024
Course..........: ITI-221 - ProgramaciÃ³n I
Document........: Test 2
Goals...........: Complete the test
Professor.......: Jorge Ruiz (york)
Student.........: Brandon Conejo Quiros
====================================================================================== */











public class Main {

    String personas[];

    public static void main(String[] args) {

        // Creates a new instance of the functions class
        functions f = new functions();


        String Ocupacion;
        String Gusto_Musical;
        String Creencia;
        String Gusto_Culinario;
        String Genero;
        String Grupo;
        String Elegido;
        int pos;

//        String Ocupacion = f.Ocupacion();
//        String Gusto_Musical = f.GustoMusical();
//        String Creencia = f.Creencias();
//        String Gusto_Culinario = f.Culinario();
//        String Genero = f.Genero();
//        String Grupo = f.Grupo();




        // Print the header of the table
        System.out.printf("%5s | %-10s | %-30s | %-4s | %-8s | %-10s | %-10s | %-15s | %-15s | %-15s | %-15s\n","ID", "CÃ©dula", "Nombre Completo","Sexo", "E. Civil", "Nacido","Ocupación","Gusto Musical","Creencias","Gusto Culinario","Genero");
        System.out.println("------+------------+--------------------------------+------+----------+-------------+-----------+-----------------+-----------------+-----------------+-----------------");


        //Creates an array of 1001 spots for the containment of data
        cls_Persona[] Persona = new cls_Persona[1001];
        cls_Relaciones[][] Relacion = new cls_Relaciones[1001][4];
        cls_Relaciones[]   Excluidos = new cls_Relaciones[1001];



        //Just in case, this fills the relations matrix with blank data

        for (int i = 0; i < 1001; i++){
            Relacion[i][1] = new cls_Relaciones();
            Relacion[i][1].setNombre("");
            Relacion[i][1].setNombreRelacion("");
            Relacion[i][1].setValorRelación("");
            Relacion[i][2] = new cls_Relaciones();
            Relacion[i][2].setNombre("");
            Relacion[i][2].setNombreRelacion("");
            Relacion[i][2].setValorRelación("");
            Relacion[i][3] = new cls_Relaciones();
            Relacion[i][3].setNombre("");
            Relacion[i][3].setNombreRelacion("");
            Relacion[i][3].setValorRelación("");
            Excluidos[i] = new cls_Relaciones();
            Excluidos[i].setNombre("");
        }



        //This goes through all thousand spots and fills them in with the correct information
        for (int i = 0; i <= 1000; i++) {

            Persona[i] = new cls_Persona();
            Persona[i].setCedula(f.Cedula());
            Persona[i].setNombre(f.Nombre() + " " + f.Apellido() + " " + f.Apellido());
            Persona[i].setSexo(f.Sexo());
            Persona[i].seteCivil(f.estCivil());
            Persona[i].setOcupacion(f.Ocupacion());
            Persona[i].setGusto_Musical(f.GustoMusical());
            Persona[i].setCreencia(f.Creencias());



            //Prints the information, make it normal code to see it in effect
//            System.out.println(Persona[i].getCedula() + " " + Persona[i].getOcupacion());
        }


        //What this does is that it looks through the group of people
        //And if it finds one that matches the desired attributes, it will sort them out in said group

        String Extra1;
        String Extra2;

        for (int L = 1; L < 4; L++) {

//            System.out.println("Grupo" + L);

            Grupo = f.Grupo();
            Ocupacion = f.Ocupacion();
            Gusto_Musical = f.GustoMusical();
            Creencia = f.Creencias();
            Gusto_Culinario = f.Culinario();
            Genero = f.Genero();
            Elegido = "";
            Extra1 = f.Extra1();
            Extra2 = f.Extra2();



            //Sees which group was chosen, and then chooses which attribute will be given more importance
            if (Grupo == "Trabajo"){Elegido = Ocupacion;}
            else if (Grupo == "Musica") {Elegido = Gusto_Musical;}
            else if (Grupo == "Creencia") {Elegido = Creencia;}
            else if (Grupo == "Comida") {Elegido = Gusto_Culinario; }
            else if (Grupo == "Genero") {Elegido = Genero;}





            for (int i = 0; i <= 1000; i++) {

                if ((Persona[i].getOcupacion() == Elegido ) || (Persona[i].getGusto_Musical() == Elegido) || (Persona[i].getGusto_Culinario() == Elegido) || (Persona[i].getCreencia() == Elegido) || (Persona[i].getGenero() == Genero)
                        && (Persona[i].getOcupacion() == Extra1) || (Persona[i].getGusto_Musical() == Extra1) || (Persona[i].getGusto_Culinario() == Extra1) || (Persona[i].getCreencia() == Extra1) || (Persona[i].getGenero() == Extra1)
                        && (Persona[i].getOcupacion() == Ocupacion) || (Persona[i].getGusto_Musical() == Gusto_Musical) || (Persona[i].getGusto_Culinario() == Gusto_Culinario) || (Persona[i].getCreencia() == Creencia) || (Persona[i].getGenero() == Genero) && (Persona[i].isSeleccionado() == false))
                {


                    Relacion[i][L] = new cls_Relaciones();
                    Relacion[i][L].setNombreRelacion(Grupo);
                    Relacion[i][L].setValorRelación(Elegido + " " + Extra1 + " " + Extra2);
                    Relacion[i][L].setNombre(Persona[i].getNombre());
                    Persona[i].setSeleccionado(true);
                }




            }


        }

        for (int i = 0; i <= 1000; i++){

            if (Persona[i].isSeleccionado() == false){

                Excluidos[i] = new cls_Relaciones();
                Excluidos[i].setNombre(Persona[i].getNombre());

            }

        }


        System.out.println("----------------Relacion1-----------------------------------------------------------------");
        System.out.println("Nombre Relacion:" + Relacion[1][1].getNombreRelacion() + "  " + "Valor Relacion:" + " " + Relacion[1][1].getValorRelación());
     for (int i = 0; i < 1001; i++){

         if (Relacion[i][1].getNombre() !=""){System.out.println(Relacion[i][1].getNombre()+ i);}

     }

        System.out.println("----------------Relacion2----------------------------------------------------------------");
        System.out.println("Nombre Relacion:" + Relacion[1][2].getNombreRelacion() + "  " + "Valor Relacion:" + " " + Relacion[1][2].getValorRelación());
        for (int i = 0; i < 1001; i++){

            if (Relacion[i][2].getNombre() !=""){System.out.println(Relacion[i][2].getNombre()+ " " + i);}

        }

        System.out.println("----------------Relacion3----------------------------------------------------------------");

        System.out.println("Nombre Relacion:" + Relacion[1][3].getNombreRelacion() + "  " + "Valor Relacion:" + " " + Relacion[1][3].getValorRelación());

        for (int i = 0; i < 1001; i++){
            if (Relacion[i][2].getNombre() !=""){System.out.println(Relacion[i][2].getNombre()+ i);}
        }

        System.out.println("----------------Excluidos----------------------------------------------------------------");
        for (int i = 0; i < 1001; i++){
            if (Excluidos[i].getNombre() != ""){System.out.println(Excluidos[i].getNombre()+ i);}
        }




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