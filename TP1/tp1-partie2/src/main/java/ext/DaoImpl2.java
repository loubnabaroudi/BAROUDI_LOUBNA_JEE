package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double temp = 6000;
        return temp;
    }
}
