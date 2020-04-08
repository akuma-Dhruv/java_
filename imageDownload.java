 public class ImageDownloader extends AsyncTask<String,Void , Bitmap>{

        @Override
        protected Bitmap doInBackground(String... Urls) {
            try {


                URL url = new URL(Urls[0]);
                HttpURLConnection  connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream in = connection.getInputStream();

                Bitmap mybitmap = BitmapFactory.decodeStream(in);
                return mybitmap;
            }catch (Exception e){
                e.printStackTrace();
                return null;

            }
