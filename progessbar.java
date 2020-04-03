//initilizing seekbar as progress bar     
     
     
     
     final SeekBar scrubSeekBar;
        scrubSeekBar= (SeekBar) findViewById(R.id.scrubSeekBar);
        scrubSeekBar.setMax(sound.getDuration());
        scrubSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            sound.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                sound.pause();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                sound.start();

            }
        });

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                scrubSeekBar.setProgress(sound.getCurrentPosition());
            }
        },0,1000);
