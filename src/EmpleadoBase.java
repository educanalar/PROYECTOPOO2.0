public class EmpleadoBase extends Empleado{


    public EmpleadoBase(){

    }
    public EmpleadoBase(long id,String nombre, String apellido, String curp, String direccion, int edad, String formacionAcademica,
                        int añosExperiencia, int horas_trabajadas, int pago_horas) {

        super(id,nombre, apellido, curp, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pago_horas);
    }


    @Override
    public int cant_horas_extras()
    {    int horasExtras = getHoras_trabajadas() - 40;
        if (getHoras_trabajadas() > 40)
            return  horasExtras;
        else
            return 0;
    }

    @Override
    public int  horasExtras()
    {
        int horaExtras = getHoras_trabajadas() -  40;
        if (getHoras_trabajadas() > 40 )
            return getPagoPorHora() * 2 * horaExtras;
        else
            return 0;
    }
    @Override
    public double sueldoBruto(){
        return getHoras_trabajadas() * getPagoPorHora();
    }
    @Override
    public double sueldoNeto(){
        return sueldoBruto() + horasExtras();
    }

    @Override
    public String imprimirBoletaPago() {
        return      "INFORME DEL TRABAJADOR BASE" + "\n" +
                "----------------------" + "\n" +
                "                       "+ "\n" +
                "Datos del Empleado" + "\n" +
                "ID: " + super.getId() + "\n" +
                "Nombres: " + super.getNombre()+"\n" +
                "Apellidos: " + super.getApellido()+"\n" +
                "Curp: "  + super.getCurp()+ "\n" +
                "Edad: " + super.getEdad()+"\n" +
                "Dirección: " + super.getDireccion()+"\n" +
                "Formación Academica: " + super.getFormacionAcademica()+ "\n" +
                "Años de experiencia: " + super.getAñosExperiencia()+ "\n" +
                "                        " + "\n" +
                "Resumen de Pago" + "\n" +
                "Sueldo Bruto: S/ " + sueldoBruto()+ "\n" +
                "Horas Extras: " + cant_horas_extras()+ "\n" +
                "Pago por horas Extras: S/ " + horasExtras() + "\n" +
                "Sueldo Neto: S/ " + sueldoNeto();
    }

}
