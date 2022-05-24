public class Diretor extends Funcionario
        implements Logavel{

    @Override
    public boolean efetuarLogin() {
        System.out.println("Diretor logou ... ");
        GerenciarAcesso.listaLogados.add(this);
        return true;
    }

    @Override
    public boolean efetuarLogoff() {
        System.out.println("Diretor saiu do sistema");
        GerenciarAcesso.listaLogados.remove(this);
        return true;
    }
}
