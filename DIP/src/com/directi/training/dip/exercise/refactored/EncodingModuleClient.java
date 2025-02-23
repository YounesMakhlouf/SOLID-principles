package com.directi.training.dip.exercise.refactored;


import java.net.URL;

public class EncodingModuleClient {
    public static void main(String args[]) throws Exception {
        Base64Encoder encoder=new Base64Encoder();
        FileReader fileReader=new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        FileWriter fileWriter=new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule fileEncoder=new EncodingModule(encoder,fileReader,fileWriter);

        WebsiteReader websiteReader=new WebsiteReader(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        DatabaseWriter databaseWriter=new DatabaseWriter();
        EncodingModule websiteEncoder=new EncodingModule(encoder,websiteReader,databaseWriter);

        fileEncoder.process();
        websiteEncoder.process();

    }
}
