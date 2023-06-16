package com.example.banking;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class mini extends RecyclerView.Adapter<mini.ViewHolder>{

    Context context;
    List<model> mini_list;

    public mini(Context context,List<model> mini_list){
        this.context = context;
        this.mini_list = mini_list;
    }
    @NonNull
    @Override
    public mini.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mini_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mini.ViewHolder holder, int position) {
        if(mini_list!=null && mini_list.size()>0){
            model model = mini_list.get(position);
            holder.date_lt.setText(model.getDate());
            holder.narration_lt.setText(model.getNarration());
            holder.credit_lt.setText(model.getCredit());
            holder.debit_lt.setText(model.getDebit());
            holder.balance_lt.setText(model.getBalance());
        }
        else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return mini_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView date_lt;
        TextView narration_lt;
        TextView credit_lt;
        TextView debit_lt;
        TextView balance_lt;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            date_lt = itemView.findViewById(R.id.date_lt);
            narration_lt = itemView.findViewById(R.id.narration_lt);
            credit_lt = itemView.findViewById(R.id.credit_lt);
            debit_lt = itemView.findViewById(R.id.debit_lt);
            balance_lt = itemView.findViewById(R.id.balance_lt);


        }
    }
}