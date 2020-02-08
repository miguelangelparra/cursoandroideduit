package com.dominio.biblioteca;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdaptadorLibro extends BaseAdapter {

private List<Libro> Libros;

    public AdaptadorLibro() {

    }

    public void setLibros(List<Libro> libros){
    this.Libros =libros;
}

    public AdaptadorLibro(List<Libro> libros) {
        Libros = libros;
    }


    @Override
    public int getCount() {
        return Libros.size();
    }

    @Override
    public Object getItem(int position) {
        return Libros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Libros.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View fila;
        fila = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.filalibros,parent,false);

        Libro libro = Libros.get(position);

        TextView nombreTV = fila.findViewById(R.id.nombre);
        TextView autorTV = fila.findViewById(R.id.autor);

        nombreTV.setText(libro.getNombre());
        autorTV.setText(libro.getAutor());

        return fila;
    }
}
