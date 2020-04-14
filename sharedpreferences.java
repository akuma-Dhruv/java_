        sharedPreferences = this.getSharedPreferences("PACKAGE_NAME_HERE", Context.MODE_PRIVATE);
        
        sharedPreferences.edit().putInt("Language Code",val).apply();//to save 

        
        int code=sharedPreferences.getInt("title here",default value here);//to search
