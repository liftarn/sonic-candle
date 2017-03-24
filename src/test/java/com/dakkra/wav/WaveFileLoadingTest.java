package com.dakkra.wav;

import org.junit.*;

import java.io.InputStream;

public class WaveFileLoadingTest {

    @Test
    public void testWaveFileLoading() {
        //16 bit 44100 sample rate
        int bps = 16;
        int sr = 44100;
        InputStream inputStream = LittleEndianTest.class.getResourceAsStream("/16-44100.wav");
        WavFile wf = new WavFile(inputStream);
        boolean opened = false;
        try {
            opened = wf.open();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(opened);
        Assert.assertEquals(bps, wf.getBitRate());
        Assert.assertEquals(sr, wf.getSampleRate());
    }

}
