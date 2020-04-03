
//following must be included in manifestfile to take permision 
<uses-permission android:name="android.permission.VIBRATE"/>

// this is to be import
import android.os.Vibrator;



// initilize and make phone vibrate for 400 ms 
Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
