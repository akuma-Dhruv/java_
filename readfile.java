String [] data;
    ArrayList <String> dList=new ArrayList<String>();

    ListView mylist;
    ArrayAdapter<String> arrayAdapter; 
 
 
 
 mylist= (ListView)findViewById(R.id.listView);


            InputStream inputStream = getResources().openRawResource(R.raw.sample);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        try{
            String csvline;
            while((csvline = reader.readLine()) !=null)
            {
                data=csvline.split(",");
                try {
                    dList.add(data[0]+"  " +data[1]+"    "+data[2]+"  "+data[3]+"  "+data[4]);
                    }
                catch (Exception e)
                {e.printStackTrace();}


            }
            arrayAdapter=  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dList);
            mylist.setAdapter(arrayAdapter);

        }catch (IOException ex)
        {throw new RuntimeException("error"+ex);}
