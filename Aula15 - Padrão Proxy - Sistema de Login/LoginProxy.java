public class LoginProxy implements Login{
    private Login user = new LoginReal();

    @Override
    public boolean conectar(Acesso acesso){
        if (!desconectar(acesso)){
            return true;
        }
        return user.conectar(acesso);
    }

    @Override
    public boolean desconectar(Acesso acesso){
        return user.desconectar(acesso);
    }
}