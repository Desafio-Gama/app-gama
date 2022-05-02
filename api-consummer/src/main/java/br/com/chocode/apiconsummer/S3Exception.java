package br.com.chocode.apiconsummer;

import sun.security.krb5.KrbException;

public class S3Exception extends Exception {
    public KrbException awsErrorDetails() {

        return null;
    }
}
