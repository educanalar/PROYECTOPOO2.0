import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables a utilizar
        String nombre,apellido,curp,direccion,formacionAcademica,afp,onp;
        long id;
         int edad,añosExperiencia,horas_trabajadas,pagoPorHora,cant_hijos;
        Scanner entrada = new Scanner(System.in);

        EmpleadosBase gestionEmpBase = new EmpleadosBase();
        EmpleadosBono gestionEmpBono =  new EmpleadosBono();

        String menu = "***Bienvenido al sistema de empleados***\n"
                +"1. Registrar empleado base.\n2. Mostrar empleados de base.\n"
                +"3. Registrar empleado por bonos.\n4. Mostrar empleados por bono.\n5. Salir";
        int opcion=0;

        while(opcion!= 5){
            System.out.println(menu);
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("****Registro de empleado base****\n");
                    System.out.println("Ingresar id numerico para el empleado:");
                    id = Long.parseLong(entrada.nextLine());
                    System.out.println("Ingresar nombre del empleado:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingresar apellidos del empleado:");
                    apellido = entrada.nextLine();
                    System.out.println("Ingresar CURP:");
                    curp = entrada.nextLine();
                    System.out.println("Ingresar direccion del empleado:");
                    direccion = entrada.nextLine();
                    System.out.println("Ingresar edad del empleado:");
                    edad = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar formacion academica:");
                    formacionAcademica = entrada.nextLine();
                    System.out.println("Ingresar años experiencia:");
                    añosExperiencia = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar horas trabajadas:");
                    horas_trabajadas = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar pago x hora:");
                    pagoPorHora = Integer.parseInt(entrada.nextLine());

                    //Crea objeto con constructor con parametros
                    EmpleadoBase empBase = new EmpleadoBase(id,nombre,apellido,curp,direccion,edad,formacionAcademica,
                            añosExperiencia,horas_trabajadas,pagoPorHora);

                    if(gestionEmpBase.registrar(empBase)){
                        System.out.println("Empleado base registrado con exito.");
                    }else{
                        System.out.println("Lista de empleados llenada.");
                    }

                    break;
                case 2:
                    System.out.println(gestionEmpBase.listar());
                    break;
                case 3:
                    System.out.println("****Registro de empleado x comision****\n");
                    System.out.println("Ingresar id numerico para el empleado:");
                    id = Long.parseLong(entrada.nextLine());
                    System.out.println("Ingresar nombre del empleado:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingresar apellidos del empleado:");
                    apellido = entrada.nextLine();
                    System.out.println("Ingresar CURP:");
                    curp = entrada.nextLine();
                    System.out.println("Ingresar direccion del empleado:");
                    direccion = entrada.nextLine();
                    System.out.println("Ingresar edad del empleado:");
                    edad = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar formacion academica:");
                    formacionAcademica = entrada.nextLine();
                    System.out.println("Ingresar años experiencia:");
                    añosExperiencia = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar horas trabajadas:");
                    horas_trabajadas = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar pago x hora:");
                    pagoPorHora = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar cantidad de hijos:");
                    cant_hijos = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresar AFP de empleado:");
                    afp = entrada.nextLine();
                    System.out.println("Ingresar ONP de empleado:");
                    onp = entrada.nextLine();

                    //Crea objeto con constructor con parametros
                    EmpleadoBono empBono = new EmpleadoBono(id,nombre,apellido,curp,direccion,edad,formacionAcademica,
                            añosExperiencia,horas_trabajadas,pagoPorHora,cant_hijos,afp,onp);

                    if(gestionEmpBono.registrar(empBono)){
                        System.out.println("Empleado x comision registrado con exito.");
                    }else{
                        System.out.println("Lista de empleados x bono llenada.");
                    }
                    break;
                case 4:
                    System.out.println(gestionEmpBono.listar());
                    break;
                case 5:
                    opcion=5;
                    System.out.println("Adios, regresa pronto.");
                    break;
                default:
                    System.out.println("Seleccona una opcion del menu, vuelte a intentar.");
                    break;

            }

        }

        System.out.println("Gracias por utilizar nuestro sistema de empleados");
















    }
}