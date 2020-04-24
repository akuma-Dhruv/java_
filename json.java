public class DownloadTask extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... urls) {
        String result ="";
            URL url ;
            HttpURLConnection urlConnection= null;
            try{
                url =new URL(urls[0]);
                urlConnection =(HttpURLConnection)url.openConnection();
                InputStream in =urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while (data!=-1)
                {
                    char current = (char)data;
                    result+= current;
                    data=reader.read();

                }
                return result;
            }catch (Exception e) {
                e.printStackTrace();
            }



            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        */    try{
                JSONObject jsonObject = new JSONObject(s);
                JSONArray arr = new JSONArray(s);
                for (int i=0;i<arr.length();i++)
                {
                    JSONObject jsonPart = arr.getJSONObject(i);
                    Log.d("cases",jsonPart.getString("Cases"));
                    Log.d("date",jsonPart.getString("Date"));


                }
            }
            catch (Exception e){
                e.printStackTrace();
                Toast.makeText(MainActivity.this, "nahi chala re", Toast.LENGTH_SHORT).show();
            }*/

            //Log.d("Json",s);
        }
    }
    
    
    
    
   //-------------------------------------------------------------inside on create
   
   
   
   
   
DownloadTask task = new  DownloadTask();
        task.execute("https://api.covid19api.com/country/india/status/confirmed/live?from=2020-04-10T00:00:00Z&to=2020-04-10T00:00:00Z");
   
