public class Cliente implements Logavel{
    @Override
    public boolean efetuarLogin() {
        System.out.println("Cliente logou ....");
        GerenciarAcesso.listaLogados.add(this);
        return true;
    }

    @Override
    public boolean efetuarLogoff() {
        System.out.println("Cliente saiu do sistema ...");
        GerenciarAcesso.listaLogados.remove(this);
        return true;
    }
}
