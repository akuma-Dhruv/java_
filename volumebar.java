//here a seekbar is initilize as volume controler
//change code accordingly
import android.widget.SeekBar;
import android.media.AudioManager;
//will be imported automatically 


AudioManager audioManager;

audioManager= (AudioManager) getSystemService(AUDIO_SERVICE);
        sound =MediaPlayer.create(this,R.raw.sony);

        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int  currentVolume =audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        SeekBar volumeControl;
        volumeControl = (SeekBar) findViewById(R.id.seekBar);
        volumeControl.setMax(maxVolume);
        volumeControl.setProgress(currentVolume);
        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
