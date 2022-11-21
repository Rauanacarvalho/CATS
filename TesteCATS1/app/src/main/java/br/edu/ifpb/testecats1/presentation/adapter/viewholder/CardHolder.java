package br.edu.ifpb.testecats1.presentation.adapter.viewholder;


import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import br.edu.ifpb.testecats1.R;

//import butterknife.BindView;
//import butterknife.ButterKnife;


public class CardHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.main_card_title)
    public TextView title;

    @BindView(R.id.main_card_desc)
    public TextView desc;

    @BindView(R.id.main_card_more)
    public ImageButton moreButton;

    @BindView(R.id.main_card_delete)
    public ImageButton deleteButton;

    public CardHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}