package com.example.orgendonation.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orgendonation.Model.FetchRequestModel;
import com.example.orgendonation.Model.FetchRequestResult;
import com.example.orgendonation.R;

import java.util.List;


public class FetchRequestAdapter extends BaseAdapter
{
    Context context;
    List<FetchRequestResult> requestResults;
    LayoutInflater inflater;

    public FetchRequestAdapter(Context context, List<FetchRequestResult> requestResults)
    {
        this.context=context;
        this.requestResults=requestResults;
        inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return requestResults.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        FetchRequestResult requestResult=requestResults.get(position);
        convertView=inflater.inflate(R.layout.row_state,null);

        TextView textView4=(TextView)convertView.findViewById(R.id.row_name);
        TextView textView5=(TextView)convertView.findViewById(R.id.row_contact);
        TextView textView=(TextView)convertView.findViewById(R.id.row_orgen);
        TextView textView1=(TextView)convertView.findViewById(R.id.row_bloodgroup);
        Button button=(Button)convertView.findViewById(R.id.btncl);

        textView4.setText(requestResult.getR_name());
        textView5.setText(requestResult.getR_cnum());
        textView.setText(requestResult.getR_orgen());
        textView1.setText(requestResult.getR_bloodgroup());

        return convertView;
    }
}
