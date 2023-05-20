public class EmpleadosBono {
    private int numEmp;
    private EmpleadoBono[] listaEmpleados;

    public EmpleadosBono(){
        numEmp = 0;
        listaEmpleados = new EmpleadoBono[5];
    }

    public boolean registrar(EmpleadoBono empBono){

        if (numEmp<listaEmpleados.length){
            listaEmpleados[numEmp] = empBono;
            numEmp++;
            return true;
        }

        return false;
    }

    public String listar(){
        String salida = "***Lista de Empleados por Comision***\n";

        for (int i=0;i<listaEmpleados.length-1; i++){

            if(listaEmpleados[i] != null)
                salida+= listaEmpleados[i].imprimirBoletaPago() + "\n";
        }

        return salida;
    }
}



