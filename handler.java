//initilizing Handler as a time counter

final Handler handler = new Handler();
        final Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hello ","secondPassed");
                handler.postDelayed(this,1000);
            }


        };
        handler.post(run);
