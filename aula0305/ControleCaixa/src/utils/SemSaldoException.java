package utils;

public class SemSaldoException extends Exception {
    @Override
    public String getMessage() {
        return "Sem saldo suficiente para o saque";
    }
}
