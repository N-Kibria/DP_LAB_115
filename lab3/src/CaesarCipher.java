public class CaesarCipher implements IEncryption {
    int shift;

    CaesarCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String data) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) ((c - base + shift) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        System.out.println("Encrypted content: " + encrypted.toString());
        return encrypted.toString();
    }

    @Override
    public String decrypt(String data) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                decrypted.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}

