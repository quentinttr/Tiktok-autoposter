package fr.neyox.autovideo;

import fr.neyox.autovideo.exceptions.LoginException;
import fr.neyox.autovideo.exceptions.UploadException;
import fr.neyox.autovideo.tiktok.TiktokUploader;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {

    public static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()*2);

    public static void main(String[] args) throws UploadException, LoginException {
        TiktokUploader uploader = new TiktokUploader("Testvideo", new File("C:\\Users\\Quentin\\Downloads\\Snaptik_7041851956796591365_lyricsenfrancais.mp4"));
        uploader.upload();

    }
}
