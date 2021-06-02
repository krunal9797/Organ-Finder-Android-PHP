package com.example.orgendonation.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orgendonation.Model.FetchRequestResult;
import com.example.orgendonation.Model.FetchStateModel;
import com.example.orgendonation.Model.Statemodel;
import com.example.orgendonation.R;

import java.util.ArrayList;
import java.util.List;

public class vsAdapter extends RecyclerView.Adapter<vsAdapter.MyViewHolder>
{
    Context context;
    ArrayList<FetchRequestResult> fetchRequestResultArrayList  = new ArrayList<>();

    public vsAdapter(Context context, ArrayList<FetchRequestResult> fetchRequestResultArrayList)
    {
        this.context = context;
        this.fetchRequestResultArrayList = fetchRequestResultArrayList;
    }

    @NonNull
    @Override
    public vsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.row_state,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull vsAdapter.MyViewHolder holder, final int position)
    {
        final FetchRequestResult fetchRequestResult = fetchRequestResultArrayList.get(position);
        holder.row_name.setText("Name :"+fetchRequestResultArrayList.get(position).getR_name());
        holder.row_orgen.setText(fetchRequestResultArrayList.get(position).getR_orgen());
        holder.row_bloodgroup.setText(fetchRequestResultArrayList.get(position).getR_bloodgroup());

        holder.row_name.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"kkkkkkk",Toast.LENGTH_SHORT);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fetchRequestResultArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView row_name,row_orgen,row_bloodgroup;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            row_name = itemView.findViewById(R.id.row_name);
            row_orgen = itemView.findViewById(R.id.row_orgen);
            row_bloodgroup = itemView.findViewById(R.id.row_bloodgroup);
            context = itemView.getContext();
        }
    }
}
