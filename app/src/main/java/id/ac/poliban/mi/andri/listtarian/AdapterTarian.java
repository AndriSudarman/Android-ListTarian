package id.ac.poliban.mi.andri.listtarian;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class AdapterTarian extends BaseAdapter {
    private List<Tarian> data = new ArrayList<>();

    public AdapterTarian(List<Tarian> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_tarian;
        TextView tvTarianName;
        TextView tvTarianDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_tarian, parent, false);

        img_tarian = convertView.findViewById(R.id.img_tarian);
        tvTarianName = convertView.findViewById(R.id.tv_tarian_name);
        tvTarianDesc = convertView.findViewById(R.id.tv_tarian_description);

        Glide.with(parent.getContext())
                .load(data.get(position).getTarian())
                .apply(new RequestOptions().override(60, 60))
                .into(img_tarian);
        tvTarianName.setText(data.get(position).getTarianName());
        tvTarianDesc.setText(data.get(position).getTarianDesc());

        return convertView;
    }
}
