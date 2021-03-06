package text.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by liuwei on 7/13/17.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<Fruit> mFruitList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        public ViewHolder(View itemView) {
            super(itemView);
            fruitImage=(ImageView)itemView.findViewById(R.id.fruit_image);
            fruitName=(TextView)itemView.findViewById(R.id.fruit_name);
        }
    }

    public FruitAdapter(List<Fruit> mFruitList){
        this.mFruitList = mFruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit=mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImaged());
        holder.fruitName.setText(fruit.getName());
    }


    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
