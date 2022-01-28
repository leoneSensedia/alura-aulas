class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1111, 2222);
        primeiraConta.saca(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.transfere(100,primeiraConta);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        segundaConta.transfere(50, segundaConta);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());
    }
}