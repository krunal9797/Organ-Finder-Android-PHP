package com.example.orgendonation.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orgendonation.Model.FetchRequestResult;
import com.example.orgendonation.Model.FetchStateResult;
import com.example.orgendonation.R;
import com.example.orgendonation.ViewRec;

import java.util.ArrayList;
import java.util.List;

public class ViewStateAdapter extends RecyclerView.Adapter<ViewStateAdapter.MyViewHolder>
{
    private List<FetchRequestResult> fetchRequestResultsList;
    Context context;

    public ViewStateAdapter(List<FetchRequestResult> fetchRequestResultsList, Context context)
    {
        this.fetchRequestResultsList = fetchRequestResultsList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View listitem = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_state, parent, false);
        return new MyViewHolder(listitem);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {

        final FetchRequestResult fetchRequestResult = fetchRequestResultsList.get(position);
        holder.row_contact.setText("contact"+fetchRequestResultsList.get(position).getR_bloodgroup());
        holder.row_name.setText("Name: "+fetchRequestResultsList.get(position).getR_name());
        holder.row_orgen.setText("ORgan: "+fetchRequestResultsList.get(position).getR_orgen());
        holder.row_bloodgroup.setText("Blood: "+fetchRequestResultsList.get(position).getR_cnum());

        holder.row_name.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               // Intent viewuser = new Intent(context, ViewRec.class);
                //  viewuser.putExtra("ImageName",donorData.getImage());

                Intent viewus = new Intent(v.getContext(),ViewRec.class);
                viewus.putExtra("Name",fetchRequestResult.getR_name());
                viewus.putExtra("Contact",fetchRequestResult.getR_cnum());
                viewus.putExtra("blood",fetchRequestResult.getR_bloodgroup());
                viewus.putExtra("organ",fetchRequestResult.getR_orgen());
                viewus.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(viewus);

               // String number=contact.getText().toString();
             //  startActivity(new Intent(Intent.ACTION_CALL).setData(Uri.parse("tel:"+number)));
                Toast.makeText(v.getContext(), "Admin Will Contact You Shortly", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return fetchRequestResultsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView row_name,row_orgen,row_bloodgroup,row_contact;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            row_name = itemView.findViewById(R.id.row_name);
            row_orgen = itemView.findViewById(R.id.row_orgen);
            row_bloodgroup = itemView.findViewById(R.id.row_bloodgroup);
            row_contact = itemView.findViewById(R.id.row_contact);
        }

    }
}
