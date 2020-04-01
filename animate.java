// code to switch between two given images by anmiating
//change variable and image id accordingly
// full project along with screenshots  https://github.com/akuma-Dhruv/android/tree/master/Animation

    boolean ontap=true;
    public void bartTap(View view)
    {
        Log.i("bart","tap");
        ImageView bart = findViewById(R.id.bartImage);
        ImageView bulb = findViewById((R.id.bulbImage));
        if(ontap) {
            ontap = false;
            bart.animate().alpha(0).setDuration(1500);
            bulb.animate().alpha(1).setDuration(1500);
        }
        else {
            ontap = true;
            bart.animate().alpha(1).setDuration(1500);
            bulb.animate().alpha(0).setDuration(1500);
        }

        }
//more codes
/*      bart.animate().translationXBy(-1100).alpha(1).setDuration(1500);
        bart.animate().rotation(3600).scaleX(2).scaleY(2).alpha(1).setDuration(2500);*/
