package com.example.student.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {

private Context context;
private int resoureID;
private List<Contact> lstArray;

public CustomAdapter(Context Context, int ResoureID, List<Contact> LstArray)
{
    super(Context, ResoureID, LstArray);
    this.context = Context;
    resoureID = ResoureID;
    lstArray = LstArray;
}

public View getView(int pos, View convertView, ViewGroup parent)
{
    ViewHolder viewHolder;
    if(convertView == null)
    {
        convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        viewHolder = new ViewHolder();
        viewHolder.tvAvatar = (TextView)convertView.findViewById(R.id.tvAvatar);
        viewHolder.tvName = (TextView)convertView.findViewById(R.id.tvName);
        viewHolder.tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);
        viewHolder.tvPicture = (TextView)convertView.findViewById(R.id.tvPicture);
        convertView.setTag(viewHolder);

    }
    else {
        viewHolder = (ViewHolder)convertView.getTag();
    }

    Contact contact = lstArray.get(pos);
    viewHolder.tvAvatar.setBackgroundColor(contact.getAvatar());
    viewHolder.tvName.setText(contact.getName());
    viewHolder.tvPhone.setText(contact.getPhone());
    viewHolder.tvPicture.setBackgroundColor(contact.getPic());
    return convertView;
}


}
