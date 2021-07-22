package train.example.orangelinetrain.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import train.example.orangelinetrain.R;


public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.CategoryViewHolder>{

    private String[] data;
    Context context;

    //private AdapterView.OnItemClickListener mListener;
    private OnItemClickListener onItemClickListener1;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        onItemClickListener1 =  listener;
    }



    public ItemListAdapter(Context context , String[] catogoryTitle){
        this.data = catogoryTitle;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.station_list,parent,false);
        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(view,onItemClickListener1);
        return categoryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

//        String img = icons[position];
//        holder.imageIcon.setImageResource(Integer.parseInt(img));

        String title = data[position];
        holder.categoryTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{

        TextView categoryTitle;
        public CategoryViewHolder(@NonNull View itemView, OnItemClickListener listener) {
            super(itemView);

            categoryTitle = itemView.findViewById(R.id.categoryTitle);
        }
    }



}
