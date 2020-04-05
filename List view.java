String[] famList={"HU","ASIA"," GDI","SHS"};


final ListView mylist = (ListView)findViewById(R.id.mylist);
        final ArrayAdapter<String> arrayAdapter=  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,famList);
        mylist.setAdapter(arrayAdapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this,famList[position], Toast.LENGTH_SHORT).show();
                parent   .setVisibility(View.GONE);
            }
        });
