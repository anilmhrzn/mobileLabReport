package com.example.myapplication;
import android.view.*;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PersonAdapter extends
        RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    List<ContactItem> contactItemList;
    public PersonAdapter(List<ContactItem> contactItemList){
        this.contactItemList = contactItemList;
    }
    class PersonViewHolder extends RecyclerView.ViewHolder{
        private TextView txt1,txt2,txt3,txt4;
        PersonViewHolder(View view){
            super(view);
            txt1 = view.findViewById(R.id.recyclerItem1);
            txt2 = view.findViewById(R.id.recyclerItem2);
            txt3 = view.findViewById(R.id.recyclerItem3);
            txt4 = view.findViewById(R.id.recyclerItem4);
        }
    }
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int
            viewType){
        View view =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item,viewGroup,false);
        return new PersonViewHolder(view);
    };
    public void onBindViewHolder(PersonViewHolder holder, int position){
        ContactItem contactItem = contactItemList.get(position);
        String name = contactItem.getName();
        String address = contactItem.getAddress();
        String contact = contactItem.getContact();
        String age = Integer.toString(contactItem.getAge());
        holder.txt1.setText("Name: "+name);
        holder.txt2.setText("Address: "+address);
        holder.txt3.setText("Contact: "+contact);
        holder.txt4.setText("Age: "+age);
    }
    public int getItemCount(){
        return this.contactItemList.size();
    }
}