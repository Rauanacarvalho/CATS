package br.edu.ifpb.testecats1.presentation.adapter.viewholder;
import br.edu.ifpb.testecats1.R;
import android.view.View;
import android.widget.ImageButton;

import androidx.recyclerview.widget.RecyclerView;

public class LineHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.main_line_title)
    public TextView title;

    @BindView(R.id.main_line_more)
    public ImageButton moreButton;

    @BindView(R.id.main_line_delete)
    public ImageButton deleteButton;

    public LineHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
