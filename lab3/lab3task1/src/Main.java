class SymbolTest {
    public static void main(String[] args) {
        for ( int i = 0; i < Integer.parseInt(args[0]); i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    System.out.println("голосна");
                    break;
                case 'y': case 'w':
                    System.out.println("голосна/приголосна");
                    break;
                default:
                    System.out.println("приголосна");
            }
        }
    }
}
