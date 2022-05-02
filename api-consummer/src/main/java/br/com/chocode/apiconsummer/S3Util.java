package br.com.chocode.apiconsummer;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.arn.Arn;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.web.bind.annotation.RequestBody;
import sun.security.krb5.KrbException;


public class S3Util<inputStream, request> {
    private static final String BUCKET = "grupo4-bucket";

    public static <S3Client> void uploadFile(String fileName, InputStream inputStream)
            throws S3Exception, AwsServiceException, SdkClientException, IOException {
        Arn S3Client = null;
        S3Client client = (S3Client) Arn.builder().build();

        try {

            PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                    .bucket(BUCKET)
                    .key(fileName)
                    .acl("public-read")
                    .build();

            AmazonS3 s3Client = null;
            s3Client.putObject(putObjectRequest, RequestBody.fromString("SDK for Java test"));

        } catch (S3Exception e) {
            e.awsErrorDetails();
            System.err.println(KrbException.errorMessage());
            System.exit(1);
        }

}

    PutObjectRequest request = PutObjectRequest.builder()
            .bucket()
            .key()
            .build();

        client.putObject(request,
            RequestBody.fromInputStream(inputStream, inputStream.available()));
}