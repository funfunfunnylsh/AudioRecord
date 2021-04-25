package com.dsx.audio.util;

/**
 * Created by Dsx on 2021/2/25
 */
public class LameJniUtil {
    static {
        System.loadLibrary("native-lib");
    }
    public native String getVersion();
    //初始化lame
    public native int pcmTomp3(String pcmPath,String mp3Path,int sampleRate, int channel,  int bitRate);
    public native void destroy();

}
