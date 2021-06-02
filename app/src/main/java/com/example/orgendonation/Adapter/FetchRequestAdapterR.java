package com.example.orgendonation.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orgendonation.Model.FetchBloodOrganResult;
import com.example.orgendonation.Model.FetchRequestResult;
import com.example.orgendonation.R;
import com.example.orgendonation.ViewRec;

import java.util.List;

public class FetchRequestAdapterR extends RecyclerView.Adapter<FetchRequestAdapterR.MyViewHolder> {

    private List<FetchRequestResult> fetchRequestResultList;
    Context context;

    public FetchRequestAdapterR(List<FetchRequestResult> fetchRequestResultList, Context context) {
        this.fetchRequestResultList = fetchRequestResultList;
        this.context = context;
    }

    @NonNull
    @Override
    public FetchRequestAdapterR.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View listitem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_state, parent, false);
        return new FetchRequestAdapterR.MyViewHolder(listitem);
      }

    @Override
    public void onBindViewHolder(@NonNull FetchRequestAdapterR.MyViewHolder holder, int position)
    {
        final FetchRequestResult fetchRequestResult = fetchRequestResultList.get(position);
        holder.row_contact.setText(""+fetchRequestResultList.get(position).getR_cnum());
        holder.row_name.setText(""+fetchRequestResultList.get(position).getR_name());
        holder.row_orgen.setText(""+fetchRequestResultList.get(position).getR_orgen());
        holder.row_bloodgroup.setText(""+fetchRequestResultList.get(position).getR_bloodgroup());

        holder.row_contact.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent viewus = new Intent(v.getContext(), ViewRec.class);
                viewus.putExtra("Name",fetchRequestResult.getR_name());
                viewus.putExtra("Contact",fetchRequestResult.getR_cnum());
                viewus.putExtra("Blood",fetchRequestResult.getR_bloodgroup());
                viewus.putExtra("Organ",fetchRequestResult.getR_orgen());
                viewus.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(viewus);
                Toast.makeText(v.getContext(),"response",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return fetchRequestResultList.size();
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
