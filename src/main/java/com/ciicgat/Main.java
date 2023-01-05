package com.ciicgat;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.PGPException;

import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Security;

/**
 * Created by August.Zhou on ${DATE} ${HOUR}:${MINUTE}
 */
public class Main {
    public static void main(String[] args) throws PGPException, IOException, NoSuchProviderException {
        Security.addProvider(new BouncyCastleProvider());
        KeyBasedLargeFileProcessor.encryptFile("hello.txt.asc","hello.txt","public.asc",false,false);
    }
}