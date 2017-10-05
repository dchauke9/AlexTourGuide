package com.example.ekasilabalexcdtb.alextourguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eKasiLab Alex CDTB on 19 Jul 2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<Contact> contactList;

    public MyAdapter(Context context, List<Contact> contactList){
        this.context = context;
        this.contactList = contactList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.title.setText(contact.getTitle());
        holder.txtName.setText(contact.getName());
        holder.txtSurname.setText(contact.getSurname());
        holder.txtEmail.setText(contact.getEmail());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView txtName;
        TextView txtSurname;
        TextView txtEmail;
        public MyViewHolder(View itemView) {
            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.txtName);
            title = (TextView) itemView.findViewById(R.id.title);
            txtSurname = (TextView) itemView.findViewById(R.id.txtSurname);
            txtEmail = (TextView) itemView.findViewById(R.id.txtEmail);
        }
    }
}
