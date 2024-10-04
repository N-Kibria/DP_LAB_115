import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        IEncryption I;
        Encryption en = new Encryption();

        System.out.print("Enter the path of the file to encrypt: ");
        String filePath = scanner.nextLine();
        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));

        System.out.println("Select encryption algorithm: 1. AES  2. DES  3. Caesar Cipher");
        int choice = scanner.nextInt();

        String encryptedContent ;
        switch (choice) {
            case 1:
                en.setEncryptionType(new AESEncryption());
                encryptedContent = en.encrypt(fileContent);

                break;
            case 2:
                en.setEncryptionType(new DESEncryption());
                encryptedContent = en.encrypt(fileContent);

                break;
            case 3:
                System.out.print("Enter the Caesar cipher shift value: ");
                int shift = scanner.nextInt();
                en.setEncryptionType(new CaesarCipher(shift));
                encryptedContent = en.encrypt(fileContent);

                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.print("Do you want to decrypt the content? (yes/no): ");
        String decryptChoice = scanner.next();

        if (decryptChoice.equalsIgnoreCase("yes")) {
            System.out.println( en.decrypt(encryptedContent));
        } else {
            System.out.println("Decryption skipped.");
        }
    }
}
