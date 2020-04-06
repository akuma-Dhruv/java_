
        new CountDownTimer(10000,1000)
        {


            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Seconds left",String.valueOf(millisUntilFinished/1000));
            }

            public void onFinish(){
                Log.i("we are done","no more seconds left");
                }
