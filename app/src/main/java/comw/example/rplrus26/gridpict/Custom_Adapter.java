package comw.example.rplrus26.gridpict;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Custom_Adapter extends BaseAdapter {

    private ArrayList<Novel>NovelArrayList;
    private Novel novel;
    private Context context;

    public Custom_Adapter(ArrayList<Novel>NovelArrayList, Context context){
        this.NovelArrayList = NovelArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.NovelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.NovelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup parent) {
        final int pos = position;
        novel = NovelArrayList.get(pos);
        final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ConvertView = inflater.inflate(R.layout.item_list, parent, false);
        ImageView imageView = (ImageView) ConvertView.findViewById(R.id.circleView);
        TextView textView = (TextView) ConvertView.findViewById(R.id.text_name);
        Glide.with(ConvertView.getContext())
                .load(novel.getGambar())
                .into(imageView);
        textView.setText(novel.getNama());
        final String nama = novel.getNama();
        final int gambar = novel.getGambar();
        final String deskripsi = novel.getDeskripsi();
        ConvertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context.getApplicationContext(),Detail_Grid.class);
                i.putExtra("nama", nama);
                i.putExtra("gambar", gambar);
                i.putExtra("deskripsi", deskripsi);
                context.startActivity(i);
            }
        });
        return ConvertView;
    }
}
