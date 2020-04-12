/*create a separate file in a separate folder in res folder 

<item android:title="item1"  android:id="@+id/item1"></item>
<item android:title="item2" android:id="@+id/item2"></item>

//////////////////////////////////////java code
@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
    
    
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        
        return 
        }
        
