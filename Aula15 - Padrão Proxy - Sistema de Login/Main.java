public class Main {
    public static void main(String[] args) {
        Login login = new LoginProxy();
            final Acesso acessoErrado = new Acesso("admin", "15661");
            final Acesso acessoCorreto = new Acesso("anapaula", "ana2022");
            statusLogin(login, acessoErrado);
            statusLogin(login, acessoCorreto);
    }

    private static void statusLogin(Login login, final Acesso acesso){
        boolean conectar = login.conectar(acesso);
        if(conectar){
            System.out.println("Usuario logado!");
        }else{
            System.out.println("Usuario não existe!");

        }
    }
}
