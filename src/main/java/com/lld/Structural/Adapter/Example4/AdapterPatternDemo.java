package com.lld.Structural.Adapter.Example4;

public class AdapterPatternDemo {
    // Target interface
    interface MediaPlayer {
        void play(String audioType, String fileName);
    }

    // Adaptee interface
    interface AdvancedMediaPlayer {
        void playVlc(String fileName);

        void playMp4(String fileName);
    }

    // Concrete Adaptee: VLC
    static class VlcPlayer implements AdvancedMediaPlayer {
        public void playVlc(String fileName) {
            System.out.println("Playing vlc file: " + fileName);
        }

        public void playMp4(String fileName) {
        } // Not supported
    }

    // Concrete Adaptee: MP4
    static class Mp4Player implements AdvancedMediaPlayer {
        public void playVlc(String fileName) {
        } // Not supported

        public void playMp4(String fileName) {
            System.out.println("Playing mp4 file: " + fileName);
        }
    }

    // Adapter class
    static class MediaAdapter implements MediaPlayer {
        AdvancedMediaPlayer advancedPlayer;

        public MediaAdapter(String audioType) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedPlayer = new VlcPlayer();
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedPlayer = new Mp4Player();
            }
        }

        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedPlayer.playVlc(fileName);
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedPlayer.playMp4(fileName);
            }
        }
    }

    // Client class using the adapter
    static class AudioPlayer implements MediaPlayer {
        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp3")) {
                System.out.println("Playing mp3 file: " + fileName);
            } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
                MediaAdapter adapter = new MediaAdapter(audioType);
                adapter.play(audioType, fileName);
            } else {
                System.out.println("Invalid media format: " + audioType);
            }
        }
    }

    // Main method to test the pattern
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
        player.play("avi", "clip.avi"); // Unsupported format
    }
}
