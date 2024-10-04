import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
public class AESEncryption implements IEncryption{
    private static final String ALGORITHM = "AES";
    private SecretKey secretKey;

    public AESEncryption() throws Exception {

        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(128); // You can choose 128, 192, or 256 bits
        this.secretKey = keyGen.generateKey();
    }


    public AESEncryption(byte[] key) {
        this.secretKey = new SecretKeySpec(key, ALGORITHM);
    }
    @Override
    public String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            System.out.println("Encrypted content: " +Base64.getEncoder().encodeToString(encryptedBytes));
            return Base64.getEncoder().encodeToString(encryptedBytes); // Convert to Base64 for readable format
        } catch (Exception e) {
            throw new RuntimeException("Error occurred during encryption", e);
        }
    }

    @Override
    public String decrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(data); // Decode Base64 string
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Error occurred during decryption", e);
        }
    }


   /* public byte[] getSecretKey() {
        return secretKey.getEncoded();
    }*/
}
