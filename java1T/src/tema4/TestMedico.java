package tema4;

public class TestMedico {
    public static void main(String[] args) {

        Medico medico1 = new Medico("sam",Especialidad.GENERAL,28
                ,"Medico1@email.com","+34101010",Estado.INACTIVO);

        medico1.alta();

        Medico medico2 = new Medico("diaz",Especialidad.CARDIOLOGIA,30
                ,"Medico2@email.com","+34101010",Estado.ACTIVO);

        medico2.baja();


        System.out.println(medico1);

        System.out.println(medico2);
    }
}
