public class SistemaDeAcesso {
    private Acesso acesso;
    private String usuario;
    private String senha;

    public SistemaDeAcesso(Acesso acesso){
        this.acesso = acesso;
        this.usuario = "anapaula";
        this.senha = "ana2022";
    }

    public boolean check(){
        final boolean usuarioValido = usuario.equals(acesso.getUsuario());
        final boolean senhaValida = senha.equals(acesso.getSenha());
        boolean validos = usuarioValido && senhaValida;
        if (validos) {
        }
        return validos;
    }
}
