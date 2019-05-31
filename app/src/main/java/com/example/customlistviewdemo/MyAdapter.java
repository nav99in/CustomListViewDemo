package com.example.customlistviewdemo;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends ArrayAdapter<Item> {
    ArrayList<Item> animalList=new ArrayList<>();
  //  public MyAdapter(MainActivity mainActivity, int items, ArrayList<Item> animallist) {
    //}
    public MyAdapter(Context context,int textViewResourceId,ArrayList<Item> objects) {
        super(context,textViewResourceId,objects);
        animalList=objects;


    }




    @Override
    public int getCount() {
        return super.getCount();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    //
    {
        View v=convertView;
        LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Layout_inflater_service is a system service which is called
        v=inflater.inflate(R.layout.items,null);
        //We cant pass View Group here thats why second parameter/view_group is null.
        //Layout Inflater used to sqeezes all the components in the List View
        TextView textView=(TextView) v.findViewById(R.id.textView);//It is mendatory to do typecasting for all the infladters AND Managers.
        //we are calling method with the reference of v which is a object of Class "VIEW" because thnis class doesn't extend the class "App Compact Activity".
        ImageView imageView=(ImageView) v.findViewById(R.id.imageView);//It is mendatory to do typecasting for all the infladters AND Managers.
        textView.setText(animalList.get(position).getAnimalName());
        imageView.setImageResource(animalList.get(position).getAnimalImage());
        return v;
    }


}
