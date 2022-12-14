package br.edu.ifpb.testecats1.presentation.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.edu.ifpb.testecats1.CardHolder;
import br.edu.ifpb.testecats1.R;
import br.edu.ifpb.testecats1.model.UserModel;

/**
 * Created by rafael on 15/11/16.
 */

public class CardAdapter extends RecyclerView.Adapter<CardHolder> {

    private final List<UserModel> mUsers;

    public CardAdapter(ArrayList users) {
        mUsers = users;
    }

    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CardHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(CardHolder holder, int position) {
        holder.title.setText(String.format(Locale.getDefault(), "%s, %d - %s",
                mUsers.get(position).getName(),
                mUsers.get(position).getAge(),
                mUsers.get(position).getCity()
        ));
        holder.desc.setText(mUsers.get(position).getDescription());
        holder.moreButton.setOnClickListener(view -> updateItem(position));
        holder.deleteButton.setOnClickListener(view -> removerItem(position));
    }

    @Override
    public int getItemCount() {
        return mUsers != null ? mUsers.size() : 0;
    }

    private void insertItem(UserModel user) {
        mUsers.add(user);
        notifyItemInserted(getItemCount());
    }

    private void updateItem(int position) {
        mUsers.get(position).incrementAge();
        notifyItemChanged(position);
    }

    private void removerItem(int position) {
        mUsers.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mUsers.size());
    }

    public void updateList(UserModel user) {
        insertItem(user);
    }
}

