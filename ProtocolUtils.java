public class ProtocolUtils {
    /*
     * CRC16-USB for byte array
     */
    private static short calculateCRC16(byte[] bytes) {
        int crc = 0xFFFF;

        for (byte b : bytes) {
            crc ^= (b & 0xFF);
            for (int i = 0; i < 8; i++) {
                if ((crc & 0x0001) != 0) {
                    crc = (crc >> 1) ^0xA001;
                } else {
                    crc >>= 1;
                }
            }
        }

        return (short) ~crc;
    }

    /*
     * Hex string to byte array
     */
    private static byte hexToByte(String inHex) {
        return (byte)Integer.parseInt(inHex,16);
    }

    private static byte[] hexToByteArray(String inHex) {
        int hexlen = inHex.length();
        byte[] result;
        if (hexlen % 2 == 1){
            hexlen ++;
            result = new byte[(hexlen / 2)];
            inHex = "0" + inHex;
        }else {
            result = new byte[(hexlen / 2)];
        }
        int j=0;
        for (int i = 0; i < hexlen; i += 2){
            result[j] = hexToByte(inHex.substring(i, i + 2));
            j ++;
        }
        return result;
    }
}
