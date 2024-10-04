public class Encryption {
    IEncryption encryption;

    public IEncryption setEncryptionType(IEncryption encryption)
    {
        this.encryption = encryption;
        return encryption;
    }

    public String encrypt(String data)
    {
        return encryption.encrypt(data);
    }
    public String decrypt(String data)
    {
        return encryption.decrypt(data);
    }
}
