package com.example.cuddle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// TODO: WTF?
import androidx.annotation.NonNull;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<Card> {

    Context context;

    public arrayAdapter(Context context, int resourceId, List<Card> items) {
        super (context, resourceId, items);
    }

    public View getView(int position, View convertView,@NonNull ViewGroup parent) {
        Card card_item = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.nameTextView);
        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);

        name.setText(card_item.getName());
        image.setImageResource(R.mipmap.ic_launcher);

        return convertView;
    }
}
