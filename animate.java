// code to switch bwetween two given iamges by anmiating
//vahnge variable and image id accordingly


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
