package com.asus.uasamub_kursusbahasa_ti7a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KursusAdapter extends RecyclerView.Adapter<KursusAdapter.MyViewHolder> {

    Context context;
    ArrayList<MyKursus> myKursus;

    public KursusAdapter(Context c, ArrayList<MyKursus> p){
        context = c;
        myKursus = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.
                from(context).inflate(R.layout.item_mykursus,
                viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.xnama_pelatihan.setText(myKursus.get(i).getNama_kursus());
        myViewHolder.xlokasi.setText(myKursus.get(i).getLokasi());
        myViewHolder.xjumlah_pelatihan.setText(myKursus.get(i).getJumlah_kursus() + " Kursus");

        final String getNamaPelatihan = myKursus.get(i).getNama_kursus();

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomyticketdetails = new Intent(context, MyPelatihanDetailAct.class);
                gotomyticketdetails.putExtra("nama_pelatihan", getNamaPelatihan);
                context.startActivity(gotomyticketdetails);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myKursus.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView xnama_pelatihan, xlokasi, xjumlah_pelatihan;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            xnama_pelatihan = itemView.findViewById(R.id.xnama_kursus);
            xlokasi = itemView.findViewById(R.id.xlokasi);
            xjumlah_pelatihan = itemView.findViewById(R.id.xjumlah_kursus);

        }
    }

}
