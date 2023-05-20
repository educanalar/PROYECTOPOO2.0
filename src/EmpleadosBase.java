public class EmpleadosBase {
    private int numEmp;
    private EmpleadoBase[] listaEmpleados;

    public EmpleadosBase(){
        numEmp = 0;
        listaEmpleados = new EmpleadoBase[5];
    }

    public boolean registrar(EmpleadoBase empBase){

        if (numEmp<listaEmpleados.length){
            listaEmpleados[numEmp] = empBase;
            numEmp++;
            return true;
        }

        return false;
    }

    public String listar(){
        String salida = "***Lista de Empleados Base***\n";

        for (int i=0;i<listaEmpleados.length; i++){

            if(listaEmpleados[i] != null)
                salida+= listaEmpleados[i].imprimirBoletaPago() + "\n";
        }

        return salida;
    }
}
