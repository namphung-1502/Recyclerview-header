package com.sict.app.sectionrecyclerviewheader.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sict.app.sectionrecyclerviewheader.R;
import com.sict.app.sectionrecyclerviewheader.model.person;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class personAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int HEADER =0 ;
    private static final int ITEM = 1;
    private ArrayList<person> list;

    public personAdapter(ArrayList list) {
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {
       if(list.get(position)instanceof person) {
           return ITEM;
       }
       else{
           return HEADER;
       }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == ITEM){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent,false);
            return new ViewHolderItem(view);
        }
        else{
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_header,parent,false);
            return new ViewHolderHeader(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == ITEM){
            ViewHolderItem v = (ViewHolderItem) holder;
            v.txt_phone.setText(list.get(position).getNumber());
            v.txt_name.setText(list.get(position).getName());
        }
        else{
           ViewHolderHeader v = (ViewHolderHeader) holder;
           v.txt_header.setText((CharSequence) list.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolderItem extends RecyclerView.ViewHolder {
        TextView txt_name;
        TextView txt_phone;
        public ViewHolderItem(@NonNull View itemView) {
            super(itemView);
            txt_name =(TextView) itemView.findViewById(R.id.txt_name);
            txt_phone = (TextView)itemView.findViewById(R.id.txt_phone);
        }
    }

    public class ViewHolderHeader extends RecyclerView.ViewHolder {
        TextView txt_header;
        public ViewHolderHeader(@NonNull View itemView) {
            super(itemView);
            txt_header = (TextView)itemView.findViewById(R.id.txt_header);
        }
    }
}
