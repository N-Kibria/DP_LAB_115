import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class DESEncryption implements IEncryption {
    private static final String ALGORITHM = "DES";
    private SecretKey secretKey;

    public DESEncryption() throws Exception {

        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(56);
        this.secretKey = keyGen.generateKey();
    }




    @Override
    public String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            System.out.println("Encrypted content: " + Base64.getEncoder().encodeToString(encryptedBytes));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Error occurred during DES encryption", e);
        }
    }

    @Override
    public String decrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(data);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Error occurred during DES decryption", e);
        }
    }


}
