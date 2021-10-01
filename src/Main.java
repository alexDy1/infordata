import java.util.Calendar;
public class Main {
    public static void main(String[] args) {



        CPU cpu= new CPU(25,"Core i9 10900K","F3H85","Intel","EEUU", Calendar.getInstance().getTime());
        Monitores monitores= new Monitores(1080,"Televisor Smart","KATYT78","SAMNSUNG","China",Calendar.getInstance().getTime());
        HDD discos = new HDD(2480,"Toshiba","TYR85P","Barracuda","EEUU",Calendar.getInstance().getTime());


        Alquiler alquiler= new Alquiler("KLP77",168.6,monitores,discos);


        Proveedores proveedores= new Proveedores("GT895","La Paz el Alto",680,cpu,Calendar.getInstance().getTime());
        Proveedores monitor= new Proveedores("GT895","Tarija",1280,monitores,Calendar.getInstance().getTime());


        Empresa_Fabricante fabrica=new Empresa_Fabricante("Tecnoligi","Santa Cruz",130,360.6,cpu);

        System.out.println(proveedores );
        System.out.println(monitor);
        System.out.println("______________________________________________________");
        System.out.println(monitores);
        System.out.println( cpu + "" + "Memoria Principal"+ cpu.getMemoria_principal());
        System.out.println("______________________________________________________");
        System.out.println(alquiler);
        System.out.println("______________________________________________________");
        System.out.println(fabrica);




    }

}
