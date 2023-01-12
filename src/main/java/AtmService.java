import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AtmService {

   Atm atm = new Atm();


    public boolean verification(String name,String password){
        if ("almant".equals(name)&&"almant123".equals(password)) {
            return true;
        }
        return false;
    }


    public void deposite(int deposite){
        System.out.println("amount deposite " + deposite);
        atm.setBalance(atm.getBalance()+deposite);
    }

    public void withDraw(int draw){
        if (draw < atm.getBalance()){
            System.out.println("draw of amount "+draw);
            atm.setBalance(atm.getBalance() - draw);
        }else {
            System.out.println("you dont have enought money");
        }
    }

    public int balance(){
        return atm.getBalance();
    }
}
