package com.tarun.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<ModelClass> userList;
    public UserAdapter(List<ModelClass> userList) {
        this.userList = userList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

     int resource = userList.get(position).getImgResource();
     String userName = userList.get(position).getUsername();
     String name = userList.get(position).getName();
     holder.setData(resource,userName,name);


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

      private ImageView userDp;
      private TextView userName;
      private TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userDp = itemView.findViewById(R.id.user_dp);
            userName = itemView.findViewById(R.id.username);
            name = itemView.findViewById(R.id.name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), name.getText().toString()+" || "+userName.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });


        }
        private void setData(int res, String usrName, String Name){
            userDp.setImageResource(res);
            userName.setText(usrName);
            name.setText(Name);

        }
    }
}
