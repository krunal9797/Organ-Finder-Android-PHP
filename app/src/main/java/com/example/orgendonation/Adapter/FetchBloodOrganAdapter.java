package com.example.orgendonation.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orgendonation.Model.FetchBloodOrganResult;
import com.example.orgendonation.Model.FetchRequestResult;
import com.example.orgendonation.R;
import com.example.orgendonation.ViewRec;

import java.util.List;

public class FetchBloodOrganAdapter extends RecyclerView.Adapter<FetchBloodOrganAdapter.MyViewHolder>
{

    private List<FetchBloodOrganResult> fetchBloodOrganResultList;
    Context context;

    public FetchBloodOrganAdapter(List<FetchBloodOrganResult> fetchBloodOrganResultList, Context context)
    {
        this.fetchBloodOrganResultList = fetchBloodOrganResultList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View listitem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_state, parent, false);
        return new FetchBloodOrganAdapter.MyViewHolder(listitem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        final FetchBloodOrganResult fetchBloodOrganResult = fetchBloodOrganResultList.get(position);
        holder.row_contact.setText("Contact"+fetchBloodOrganResultList.get(position).getD_contact());
        holder.row_name.setText("name: "+fetchBloodOrganResultList.get(position).getD_name());
        holder.row_orgen.setText("organ: "+fetchBloodOrganResultList.get(position).getD_category());
        holder.row_bloodgroup.setText("Blood: "+fetchBloodOrganResultList.get(position).getD_bloodgroup());

        holder.row_contact.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent viewus = new Intent(v.getContext(), ViewRec.class);
                viewus.putExtra("Name",fetchBloodOrganResult.getD_name());
                viewus.putExtra("Contact",fetchBloodOrganResult.getD_contact());
                viewus.putExtra("Blood",fetchBloodOrganResult.getD_bloodgroup());
                viewus.putExtra("Organ",fetchBloodOrganResult.getD_category());
                viewus.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(viewus);
                Toast.makeText(v.getContext(),"response",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return fetchBloodOrganResultList.size();
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
        } }
}
