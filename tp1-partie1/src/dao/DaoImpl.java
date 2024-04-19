package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        connecter a la bd pour recuperer la temp
         */

        System.out.println("version base de donnees");
        double temp = Math.random()*40 ;
        return temp;
    }
}
