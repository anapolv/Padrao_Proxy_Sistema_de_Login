import java.util.Random;

public class LoginReal implements Login{
    @Override
    public boolean conectar(Acesso acesso){
        return new SistemaDeAcesso(acesso).check();
    }

    @Override
    public boolean desconectar(Acesso acesso){
        final Random random = new Random();
        final int nextInt = random.nextInt(2);
        return nextInt == 0;
    }
}