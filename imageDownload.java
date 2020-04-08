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
         
         /////////////////////////for button 
         ImageView imageView;
        public void downloadImage(View view)
        { ImageDownloader task = new ImageDownloader();
            Bitmap myimage;
            try {
                myimage= task.execute("https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.ideacustom.com%2Fsites%2Fdefault%2Ffiles%2Fshowcase-original-images%2FBird-Eyes_Vector_0.jpg&f=1&nofb=1").get();
                imageView.setImageBitmap(myimage);
            } catch(Exception e){
                e.printStackTrace();
            }

