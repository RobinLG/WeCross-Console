package com.webank.wecross.console.common;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Hash {
    public String getRandom(int numBytes) {
        SecureRandom random = new SecureRandom();
        return bytesToHex(random.generateSeed(numBytes));
    }

    public String sha256(String msg) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String encodestr;
        messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(msg.getBytes(StandardCharsets.UTF_8));
        encodestr = bytesToHex(messageDigest.digest());
        return encodestr;
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder stringBuffer = new StringBuilder();
        String temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
