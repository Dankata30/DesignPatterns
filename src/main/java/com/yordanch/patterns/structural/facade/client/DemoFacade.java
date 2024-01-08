package com.yordanch.patterns.structural.facade.client;

import com.yordanch.patterns.structural.facade.facade.VideoConversionFacade;

import java.io.File;

public class DemoFacade {
    public static void run() {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
