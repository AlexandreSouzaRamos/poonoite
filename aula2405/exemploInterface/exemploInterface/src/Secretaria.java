public class Secretaria extends Funcionario
        implements Logavel {
    @Override
    public boolean efetuarLogin() {
        System.out.println("Secretaria logou ...");
        GerenciarAcesso.listaLogados.add(this);
        return true;
    }

    @Override
    public boolean efetuarLogoff() {
        System.out.println("Secretria saiu do sistema");
        GerenciarAcesso.listaLogados.remove(this);
        return true;
    }
}
